package lab3;
import java.io.*;
import java.util.*;

public class j {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int n = (int) st.nval;

        st.nextToken();
        int k = (int) st.nval;

        long[] need = new long[n];

        for (int i = 0; i < n; i++) {

            st.nextToken();
            long x1 = (long) st.nval;

            st.nextToken();
            long y1 = (long) st.nval;

            st.nextToken();
            long x2 = (long) st.nval;

            st.nextToken();
            long y2 = (long) st.nval;

            need[i] = Math.max(x2, y2);
        }

        Arrays.sort(need);

        System.out.println(need[k - 1]);
    }
}

