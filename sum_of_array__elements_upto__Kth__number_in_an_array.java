import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //int b=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            c+=arr[i];
        }
        System.out.print(c);
        
    }
}