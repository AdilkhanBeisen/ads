import java.util.*;
import java.io.*;

public class g {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        best=Math.max(best,l+r+1);
        return 1+Math.max(l,r);

        
    }
    static int best=0;
   
    public static void solve() throws IOException{
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
                    if(curr.value==f){
                        break;
                    }
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
                        if(curr.right==null){
                            curr.right=new Node(f);
                            break;
                        }
                        else{
                            curr=curr.right;
                        }
                    }
                }
            }
        }
        height(root);
        System.out.println(best);        

    }
    public static void main(String[] args) throws Exception{
        Thread t=new Thread(null,() ->{
            try {solve(); } catch(IOException e){}
        }, "" ,1<<27);
        t.start();
        t.join();
    }
} 
