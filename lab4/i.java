import java.util.*;
import java.io.*;

public class i {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    static Node insert(Node root,int v){
        if(root==null)return new Node(v);
        if(v<root.value){
            root.left=insert(root.left,v);
        }
        else if(v>root.value){
            root.right=insert(root.right,v);
        }
        return root;
    }

    public static void main(String[] args)  throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());

        Node root=null;
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            root=insert(root,f);
        }
        int count=0;
        ArrayDeque<Node> stack=new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node s=stack.pop();
            if(s.left==null && s.right==null) count++;
            if(s.left!=null) stack.push(s.left);
            if(s.right!=null)stack.push(s.right);
        }
        System.out.println(count);
    }
}