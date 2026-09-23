package TSIS2.var1;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class a {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int h=Integer.parseInt(br.readLine());
        for(int i=0;i<h;i++){
            int n=Integer.parseInt(br.readLine());
            int[] count=new int[26];
            String[] parts=br.readLine().split(" ");
            Deque<Character> stack=new ArrayDeque<>();
            for(int j=0;j<n;j++){
                char c=parts[j].charAt(0);
                count[c-'a']++;
                if(count[c-'a']==1){
                    stack.addLast(c);
                }
                while(!stack.isEmpty() && count[stack.peekFirst()-'a']>1){
                    stack.removeFirst();
                }
                if(stack.isEmpty()){
                    System.out.print(-1+" ");
                }
                else{
                    System.out.print(stack.peekFirst()+" ");
                }
                System.out.println("\n"+" ");
            }
        }

    }
    
}
