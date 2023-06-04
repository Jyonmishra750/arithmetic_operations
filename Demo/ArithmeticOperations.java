import java.util.Scanner;
public class ArithmeticOperations
{
    void add(int x, int y)
    {
        int z = x+y;
        System.out.println("The summation of " +x+ " and " +y+ " is " +z);
    }
    void sub(int x, int y)
    {
        int z = x-y;
        System.out.println("The substraction of " +x+ " and " +y+ " is " +z);
    }
    void mul(int x, int y)
    {
        int z = x*y;
        System.out.println("The multiplication of " +x+ " and " +y+ " is " +z);
    }
    void div(int x, int y)
    {
        int z = x/y;
        System.out.println("The division of " +x+ " and " +y+ " is " +z);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("What operation do you want to perform with these two number:");
        System.out.println(">1. Addition");
        System.out.println(">2. Subtraction");
        System.out.println(">3. Multiplication");
        System.out.println(">4. division");
        System.out.print("Enter your choice: ");
        
        int choice = input.nextInt();

        ArithmeticOperations aa = new ArithmeticOperations();
        switch (choice) {
            case 1:
                aa.add(a,b);
                break;
            case 2:
                aa.sub(a,b);
                break;
            case 3:
                aa.mul(a,b);
                break;
            case 4:
                aa.div(a,b);
                break;
            default:
                System.out.println("!!!Wrong Choice");
                break;
        }

        

        
    }
}