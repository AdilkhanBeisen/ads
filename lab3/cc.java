package lab3;
import java.util.*;
import java.io.*;

public class cc {
    static int power(int[] a,int x){
        int left=0;
        int right=a.length-1;

        while(left<right){
            int mid=(left+right)/2;
            if(a[mid]>=x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left+1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        StringBuilder sb=new StringBuilder();

        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int k=(int)st.nval;

        int[] array=new int[n];
        for(int i=0;i<n;i++){
            st.nextToken();
            int f=(int)st.nval;
            array[i]=f;
        }
        int[] prefix=new int[n];
        prefix[0]=array[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<k;i++){
            st.nextToken();
            int f=(int)st.nval;
            int l=power( prefix,f);

            sb.append(l).append("\n");
        }
        System.out.println(sb);
    }
}
