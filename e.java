import java.io.*;

class e{
    public static void main(String[] args) throws IOException{
        BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
        int d=Integer.parseInt(n.readLine());
        Node head=null;
        Node tail=null;
        int ind=d/2;
        StringBuilder sb=new StringBuilder();
        
        String[] parts=n.readLine().split(" ");
        for(int i=0;i<d;i++){
            int f=Integer.parseInt(parts[i]);
            Node node=new Node();
            node.value=f;
            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
    Node prev=head;
    if(ind==0){
        head=head.next;
    }
    else{
        
        for(int i=0;i<ind-1;i++){
            prev=prev.next;
            }
        prev.next=prev.next.next;
        
    }
    Node curr=head;
    if(head==null){
        System.out.println();
    }
    else{
        while(curr!=null){
            sb.append(curr.value+" ");
            curr=curr.next;
        }
    }
    System.out.println(sb);
    }
}
class Node{
    int value;
    Node next;
}