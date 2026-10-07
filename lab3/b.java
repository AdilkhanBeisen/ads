package lab3;
import java.util.*;

public class b{
    static int Lowerbound(int[] a,int x){
        int left=0;
        int right=a.length;

        while(left<right){
            int mid=(left+right)/2;

            if(a[mid]>=x){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    static int Upper(int[] a,int x){
        int left=0;
        int right=a.length;

        while(left<right){
            int mid=(left+right)/2;

            if(a[mid]>x){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            array[i]=l;
        }
        Arrays.sort(array);
        for(int o=0;o<k;o++){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            
            int c1=Upper(array,r1)-Lowerbound(array,l1);
            int c2=Upper(array,r2)-Lowerbound(array,l2);
            int L=Math.max(l1,l2);
            int R=Math.min(r1,r2);

            int inter=0;

            if(L<=R){
                inter=Upper(array,R)-Lowerbound(array,L);
            }

            int ans=c1+c2-inter;


            System.out.println(ans);
        }

    }
}