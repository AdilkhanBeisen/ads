import java.util.*;
import java.io.*;

public class cc {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    static Node insert(Node root,int v){
        if(root==null)return new Node(v);
        if(root.value>v)root.left=insert(root.left, v);
        if(root.value<v)root.right=insert(root.right,v);
        return root;
    }
    static StringBuilder sb=new StringBuilder();

    static void preorder(Node root){
        if(root==null)return;
        sb.append(root.value).append(' ');
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Node root=null;

        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            root=insert(root, f);
        }
        int k=Integer.parseInt(br.readLine().trim());
        Node curr=root;
        while(curr.value!=k){
            if(k<curr.value){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }

        }
        preorder(root);
        System.out.println(sb.toString().trim());
    }
}
