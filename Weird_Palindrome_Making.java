import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
        int n=sc.nextInt();
        
        int[] arr=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        //int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                c+=1;
            }
        }
        System.out.println(c/2);
        a-=1;
        }
    }
}