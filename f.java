import java.io.*;

class f{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] n=br.readLine().split(" ");
        String[] m=br.readLine().split(" ");
        Node head1=null;
        Node tail1=null;
        for(int i=0;i<Integer.parseInt(n[0]);i++){
            Node node=new Node();
            node.value=Integer.parseInt(n[i+1]);
            if(head1==null){
                head1=node;
                tail1=node;
            }
            else{
                tail1.next=node;
                tail1=node;
            }
        }
        Node head2=null;
        Node tail2=null;
        for(int i=0;i<Integer.parseInt(m[0]);i++){
            Node node=new Node();
            node.value=Integer.parseInt(m[i+1]);
            if(head2==null){
                head2=node;
                tail2=node;
            }
            else{
                tail2.next=node;
                tail2=node;
            }
        }
        Node head3=null;
        Node tail3=null;
        Node p1=head1;
        Node p2=head2;
        StringBuilder sb=new StringBuilder();
        while(p1!=null && p2!=null){
            Node c;
            if(p1.value>p2.value){
                c=p2;
                p2=p2.next;
            }
            else{
                c=p1;
                p1=p1.next;
            }
            if(head3==null){
                head3=c;
                tail3=c;
            }
            else{
                tail3.next=c;
                tail3=c;
            }}
        if(p1!=null){
            if(head3==null){
                head3=p1;
            }
        else{ 
            tail3.next=p1;
            tail3=p1;
            }
            }
        if(p2!=null){
            if(head3==null){
               head3=p2;
             }
        else{
            tail3.next=p2;
            tail3=p2;
          }
            }
        
        Node curr=head3;
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