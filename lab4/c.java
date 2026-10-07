import java.io.*;
import java.util.*;

public class c{
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    static StringBuilder sb=new StringBuilder();
    
    static void preorder(Node v){
        if(v==null)return;
        sb.append(v.value).append(' ');
        preorder(v.left);
        preorder(v.right);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());

        Node root=null;

        for(int i=0;i<n;i++){
            int d=Integer.parseInt(st.nextToken());
            if(root==null){
                root=new Node(d);
            }
            else{
                Node curr=root;
                while(true){
                    if(d>curr.value){
                        if(curr.right==null){
                            curr.right=new Node(d);
                            break;
                        }
                        else{
                            curr=curr.right;
                        }
                    }
                    else{
                        if(curr.left==null){
                            curr.left=new Node(d);
                            break;
                        }
                        else{
                            curr=curr.left;
                        }
                    }

                }
            }
        }

        int k=Integer.parseInt(br.readLine());
       
        Node curr=root;
        while(curr.value!=k){
            if(curr.value>k){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
       
        preorder(curr);
        System.out.println(sb.toString().trim());
        
    }
}