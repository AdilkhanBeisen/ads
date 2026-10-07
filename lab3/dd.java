package lab3;
import java.io.*;
import java.util.Arrays;

public class dd {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        StringBuilder sb=new StringBuilder();

        st.nextToken();
        int n=(int)st.nval;
        int[] array=new int[n];

        for(int i=0;i<n;i++){
            st.nextToken();
            int f=(int)st.nval;
            array[i]=f;
        }
        st.nextToken();
        int k=(int)st.nval;
        Arrays.sort(array);
        int[] prefix=new int[n];
        prefix[0]=array[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<k;i++){
            int g=(int)st.nval;
            
        }
    }
}
