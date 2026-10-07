package lab3;
import java.util.*;

public class bb {
    static int lower(int[] a,int x){
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

    static int upper(int[] a,int x){
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<f;i++){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            int c1=upper(array, r1)-lower(array, l1);
            int c2=upper(array, r2)-lower(array,l2);

            int l=Math.max(l1,l2);
            int r=Math.max(r1,r2);

            int inter=0;

            if(r>=l){
                inter=upper(array, r)-lower(array,l);
            }

            int ans=c1+c2-inter;

            System.out.println(ans);
        }
    }
}
