package TSIS2.var2;
import java.io.*;
import java.util.StringTokenizer;

class g {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
       
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int count=0;
        String[] words=new String[n];
        while(count<n){
            st=new StringTokenizer(br.readLine());
            while(st.hasMoreTokens() && count<n){
                words[count]=st.nextToken();
                count++;
            }
        }

        StringBuilder result=new StringBuilder();

        for(int i=0;i<n;i++){
            result.append(words[(i+k)%n]);
            if(i<n-1){
                result.append(" ");
            }
        }
        System.out.println(result);

    }
    
}
