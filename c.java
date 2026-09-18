import java.util.*;

public class c{
    public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int y=n.nextInt();
    StringBuilder sb=new StringBuilder();
    int count=0;
    n.nextLine();
    String last=null;

    for(int i=0;i<y;i++){
        String cur=n.nextLine();
        if(!cur.equals(last)){
            last=cur;
            count++;
            sb.append(cur+"\n");
        }
        else{
            continue;
        }
    }
    System.out.println(count);
    System.out.print(sb);
}}
