package lab3;
import java.io.*;

public class k {

    static int find(int[] row, int x, boolean increasing) {
        int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (row[mid] == x) {
                return mid;
            }

            if (increasing) {
                if (row[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (row[mid] > x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int t = (int) st.nval;

        int[] queries = new int[t];

        for (int i = 0; i < t; i++) {
            st.nextToken();
            queries[i] = (int) st.nval;
        }

        st.nextToken();
        int n = (int) st.nval;

        st.nextToken();
        int m = (int) st.nval;

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                st.nextToken();
                a[i][j] = (int) st.nval;
            }
        }

        StringBuilder out = new StringBuilder();

        for (int x : queries) {

            boolean found = false;

            for (int i = 0; i < n; i++) {

                // odd row -> increasing
                // even row -> decreasing
                boolean increasing = (i % 2 == 1);

                int col = find(a[i], x, increasing);

                if (col != -1) {
                    out.append(i)
                       .append(' ')
                       .append(col)
                       .append('\n');

                    found = true;
                    break;
                }
            }

            if (!found) {
                out.append("-1\n");
            }
        }

        System.out.print(out);
    }
}


    

