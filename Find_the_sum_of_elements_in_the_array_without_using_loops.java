import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
    }
}