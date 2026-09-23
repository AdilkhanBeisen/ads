import java.io.*;
import java.util.*;

public class h{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());

        long current=Long.parseLong(st.nextToken());
        long maxSum=current;

        for(int i=1;i<n;i++){
            long x=Long.parseLong(st.nextToken());

            current=Math.max(x,current+x);
            maxSum=Math.max(maxSum,current);
        }
        System.out.println(maxSum);
    }
}