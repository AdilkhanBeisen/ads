import java.util.*;
import java.io.*;

public class ee1 {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    static int width(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            max=Math.max(max,size);
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node[] nodes=new Node[n+1];
        for(int i=1;i<=n;i++){
            nodes[i]=new Node(i);
        }
        for(int i=0;i<n-1;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(z==0){
                nodes[x].left=nodes[y];
            }
            else{
                nodes[x].right=nodes[y];
            }

        }
        Node root=nodes[1];

        System.out.println(width(root));
    }
}
