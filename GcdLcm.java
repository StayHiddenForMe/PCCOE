import java.util.Scanner;
class GcdLcm {
    public static void main(String[] args)
    {
        System.out.println("Enter two number : ");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("Greatest Common Divisior of "+num1+" and "+num2+" are: "+gcd);
        int lcm = (num1*num2)/gcd;
        System.out.println("Least Common Multiplier of "+num1+" and "+num2+" are: "+lcm);
        s.close();
    }    
}
