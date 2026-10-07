
package lab3;
import java.io.*;
import java.util.*;

public class f {

    static boolean canSteal(int[] bags, long k, long H) {
        long hours = 0;

        for (int bag : bags) {
            // ceil(bag / k)
            hours += (bag + k - 1) / k;

            if (hours > H) {
                return false;
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
        long H = (long) st.nval;

        int[] bags = new int[n];

        long max = 0;

        for (int i = 0; i < n; i++) {
            st.nextToken();
            bags[i] = (int) st.nval;

            max = Math.max(max, bags[i]);
        }

        long left = 1;
        long right = max;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canSteal(bags, mid, H)) {
                // mid подходит.
                // Но, возможно, есть меньший K.
                right = mid;
            } else {
                // mid слишком маленький
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}