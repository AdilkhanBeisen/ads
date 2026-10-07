package lab3;
import java.io.*;
import java.util.*;

public class e {

    // Первый индекс, где a[index] >= x
    static int lowerBound(int[] a, int x) {
        int left = 0;
        int right = a.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (a[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Первый индекс, где a[index] > x
    static int upperBound(int[] a, int x) {
        int left = 0;
        int right = a.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (a[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Сколько элементов находятся в [l, r]
    static int count(int[] a, int l, int r) {
        return upperBound(a, r) - lowerBound(a, l);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int n = (int) st.nval;

        st.nextToken();
        int q = (int) st.nval;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
        }

        Arrays.sort(a);

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < q; i++) {

            st.nextToken();
            int l1 = (int) st.nval;

            st.nextToken();
            int r1 = (int) st.nval;

            st.nextToken();
            int l2 = (int) st.nval;

            st.nextToken();
            int r2 = (int) st.nval;

            int answer;

            // Отрезки вообще не пересекаются
            if (r1 < l2 || r2 < l1) {
                answer = count(a, l1, r1)
                       + count(a, l2, r2);
            }

            // Отрезки пересекаются
            else {
                int left = Math.min(l1, l2);
                int right = Math.max(r1, r2);

                answer = count(a, left, right);
            }

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}

