
import java.io.*;

class d{
   public static void main(String[] args)throws IOException{
    BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
    int f=Integer.parseInt(n.readLine());
    Node head=null;
    Node tail=null;
    StringBuilder sb=new StringBuilder();
    String[] parts=n.readLine().split(" ");
    for(int i=0;i<f;i++){
        int d=Integer.parseInt(parts[i]);
        Node node=new Node();
        node.value=d;
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    curr=prev;
    while(curr!=null){
        sb.append(curr.value+" ");
        curr=curr.next;
    }
    System.out.println(sb);
   }
}
class Node{
    int value;
    Node next;
}