import java.util.*;
import java.io.*;

public class j {
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
        if(root.value<v){
            root.right=insert(root.right,v);
        }
        return root;
    }
    static StringBuilder sb=new StringBuilder();
    static int cnt=0,k,ans=-1;

    static void inorder(Node v){
        if(v==null)return;
        inorder(v.left);
        cnt++;
        if(cnt==k)ans=v.value;
        inorder(v.right);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st0.nextToken());
        k=Integer.parseInt(st0.nextToken());
        StringTokenizer st=new StringTokenizer(br.readLine());

        Node root=null;
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            root=insert(root,f);
        }
        inorder(root);
        System.out.println(ans);

    }
}