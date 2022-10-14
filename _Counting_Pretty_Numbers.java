import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=t;j>0;j--)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int c=0;
            for(int i=l;i<=r;i++)
            {
                int a=i%10;
                if(a==2 || a==3 || a==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}