import java.util.*;
import java.io.*;

public class a{
    public static void main(String[] args) throws Exception{
        BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
        int h=Integer.parseInt(n.readLine());
        for(int i=0;i<h;i++){
            int s=Integer.parseInt(n.readLine());
            Deque<Character> stack=new ArrayDeque<>();
            int[]count=new int[26];
            String[] parts=n.readLine().split(" ");
            for(int j=0;j<s;j++){
                
                char c=parts[j].charAt(0);
                count[c-'a']++;
                if(count[c-'a']==1){
                    stack.addLast(c);
                    
                }
                while(!stack.isEmpty()&& count[stack.peekFirst()-'a']>1){
                    stack.removeFirst();
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