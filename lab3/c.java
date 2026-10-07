package lab3;
import java.util.*;
import java.io.*;

public class c{
    static int check(int[] a,int x){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(x<=a[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left+1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        StringBuilder sb=new StringBuilder();

        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int k=(int)st.nval;

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            st.nextToken();
            int f=(int)st.nval;
            arr[i]=f;
        }
        
        
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<k;i++){
            st.nextToken();
            int x=(int)st.nval;
            int l=check(prefix,x);

            sb.append(l).append("\n");
        }
        System.out.println(sb);
    }
}

