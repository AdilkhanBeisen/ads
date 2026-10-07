package lab3;
import java.io.*;
import java.util.*;

public class h {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int n = (int) st.nval;

        st.nextToken();
        long k = (long) st.nval;

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            st.nextToken();
            long x = (long) st.nval;

            prefix[i] = prefix[i - 1] + x;
        }

        int answer = n;

        for (int left = 0; left < n; left++) {

            int l = left + 1;
            int r = n;
            int found = -1;

            while (l <= r) {

                int mid = (l + r) / 2;

                long sum = prefix[mid] - prefix[left];

                if (sum >= k) {
                    found = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            if (found != -1) {
                answer = Math.min(answer, found - left);
            }
        }

        System.out.println(answer);
    }
}

