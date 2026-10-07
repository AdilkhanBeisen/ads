import java.util.*;
import java.io.*;

public class bb3 {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Node root=null;

        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            if(root==null){
                root=new Node(f);
            }
            else{
                Node curr=root;
                while(true){
                    if(f<curr.value){
                        if(curr.left==null){
                            curr.left=new Node(f);
                            break;
                        }
                        else{
                            curr=curr.left;
                        }
                    }
                    else{
                    if(curr.left==null){
                            curr.left=new Node(f);
                            break;
                        }
                        else{
                            curr=curr.left;
                        }
                    }}
            }
        }
        int k=Integer.parseInt(br.readLine().trim());
        Node curr=root;
        while(curr.value!=k){
            if(curr.value>k){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        int cnt=0;
        ArrayDeque <Node> stack=new ArrayDeque<>();
        stack.push(curr);
        while(!stack.isEmpty()){
            Node v=stack.pop();
            cnt++;
            if(v.left!=null)stack.push(v.left);
            if(v.right!=null)stack.push(v.right);
        }
        System.out.println(cnt);
    }
}
