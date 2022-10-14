import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0;
        double a=0;
        for(int i=1;i<=n;i++)
        {
            a=(1.0/i);
            s=s+a;
        }
        System.out.printf("%.2f",s);
    }
}