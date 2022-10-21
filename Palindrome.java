import java.util.*;
class PalindromeExample{  
 public static void main(String[] args){ 
  Scanner sc=new Scanner(System.in);
  int r,sum=0,temp;    
  int n;//It is the number variable to be checked for palindrome  
  n=sc.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("True");    
  else    
   System.out.println("False");    
}  
}  