package TSIS2.var3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class d {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        Node head=null;
        Node tail=null;
        String[] parts=br.readLine().split(" ");
        for(int i=0;i<n;i++){
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
            Node d=curr.next;
            curr.next=prev;
            prev=curr;
            curr=d;
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