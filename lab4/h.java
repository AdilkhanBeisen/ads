import java.util.*;
import java.io.*;

public class h {
    static class Node{
        int value;
        Node left, right;
        Node(int v){value=v;}
    }
    static Node insert(Node root, int value ){
        if(root==null){
            return new Node(value);
        }

        if(value<root.value){
            root.left=insert(root.left,value);
        }
        else if(value>root.value){
            root.right=insert(root.right,value);
        }

        return root;
    }
    static int sum = 0;
    static StringBuilder sb = new StringBuilder();

    static void go(Node v) {
    if (v == null) return;
    go(v.right);
    sum+=v.value;
    sb.append(sum).append(" ");
    go(v.left);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());

        Node root=null;
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            root=insert(root,f);
        }
        go(root);
        System.out.println(sb.toString().trim());
    }
}