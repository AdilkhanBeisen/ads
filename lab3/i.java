package lab3;
import java.io.*;

public class i {

    static boolean canDivide(long[] a, int k, long maxSum) {
        int blocks = 1;
        long sum = 0;

        for (long x : a) {

            if (sum + x <= maxSum) {
                sum += x;
            } else {
                blocks++;
                sum = x;

                if (blocks > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int n = (int) st.nval;

        st.nextToken();
        int k = (int) st.nval;

        long[] a = new long[n];

        long left = 0;
        long right = 0;

        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (long) st.nval;

            left = Math.max(left, a[i]);
            right += a[i];
        }

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canDivide(a, k, mid)) {
                // mid подходит.
                // Пробуем уменьшить максимальную сумму.
                right = mid;
            } else {
                // mid слишком маленький.
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}

