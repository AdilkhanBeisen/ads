package lab3;
import java.io.*;
import java.util.*;

public class d{
    static void power(int[] a,long[] b,int x) throws IOException{
        int left=0;
        int right=a.length;
        int count=0;

        while(left<right){
            int mid=(left+right)/2;

            if(a[mid]<=x){
                left=mid+1;
                
            }
            else{
                right=mid;
            } 
        }
        long sum=0;
        if(left>0){
            sum=b[left-1];
        }
        
        System.out.println(left+" "+sum);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        StringBuilder sb=new StringBuilder();

        st.nextToken();
        int n=(int)st.nval;
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            st.nextToken();
            int g=(int)st.nval;
            array[i]=g;
        }
        st.nextToken();
        int k=(int)st.nval;
        Arrays.sort(array);
        long[] prefix=new long[n];
        prefix[0]=array[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<k;i++){
            st.nextToken();
            int f=(int)st.nval;
            power(array,prefix,f);
        }
    }
}

