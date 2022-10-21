import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[100];
        int c=0,d=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                c+=1;
            }
            else
            {
                System.out.print(arr[i]+" ");
                d+=1;
            }
        }
        if(d==0)
        {
            System.out.print("-1");
        }
    }
}