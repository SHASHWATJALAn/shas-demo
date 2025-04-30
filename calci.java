import java .util.Scanner;
class calci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the first number");
        int a=sc.nextInt();
        System.out.println(" Enter the second number");
        int b=sc.nextInt();
        System.out.println(" Enter the operation to be performed");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            double sum=a+b;
            System.out.println("sum of the numbers is  "+sum);
            break;
            case 2:
            double diff=a-b;
        System.out.println("difference of the numbers is  "+diff);
        break;
        case 3:
        double prod=a*b;
        System.out.println("product of the numbers is  "+prod);
        break;
        case 4: 
        if(b==0)
        {
            System.out.println("Division by zero is not possible");
            break;
        }
        else {

        
        double div=a/b;
        System.out.println("division of the numbers is  "+div);
        break;
        }
        case 5:
        if (b==0)
        {
            System.out.println("Division by zero is not possible");
            break;
        }
        else {
        double mod=a%b;
        System.out.println("modulus of the numbers is  "+mod);
        break;
        }
        default:
        System.out.println("Invalid choice");

         }     // end of switch

    }   // end of main
}   // end of class



    

