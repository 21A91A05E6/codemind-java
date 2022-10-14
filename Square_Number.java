import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n/2;i++)
        {
            for(int j=1;j<n/2;j++)
            {
                if(((i*i)*(j*j))==n)
                {
                    c=1;
                    break;
                }
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}