import java.util.*;
import java.io.*;

public class aa {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(br.readLine());
            Deque<Character> stack=new ArrayDeque<>();
            int[] count=new int[26];
            String[] parts=br.readLine().split(" ");
            for(int j=0;j<f;j++){
                char c=parts[j].charAt(0);
                count[c-'a']++;
                if(count[c-'a']==1){
                    stack.addLast(c);
                }
                while(!stack.isEmpty() && count[stack.peekFirst()-'a']>1){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    System.out.print(-1+" ");
                }
                else{
                    System.out.print(stack.peekFirst()+" ");
                }
            }
            System.out.print("\n"+" ");

        }
       

    }
}
