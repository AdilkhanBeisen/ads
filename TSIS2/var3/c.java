package TSIS2.var3;
import java.util.*;

public class c {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int count=0;
        sc.nextLine();
        String last=null;

        for(int i=0;i<n;i++){
            String d=sc.nextLine();
            if(!d.equals(last)){
                sb.append(d+"\n");
                last=d;
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
