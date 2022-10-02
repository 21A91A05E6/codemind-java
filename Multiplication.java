import java.util.Scanner;
class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int product = num1*num2;
        System.out.println(product);
    }
}