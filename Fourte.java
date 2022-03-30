import java.util.Scanner;
import java.util.Stack;

public class Fourte {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultant = input.nextInt();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        Fourte obj = new Fourte();
        obj.getNumber(num1, num2, num3, num4);
        obj.getOperator();
//        System.out.println(obj.expression);

    }

    int getNumber(int num1, int num2, int num3, int num4)
    {
        int number;
        System.out.println("Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4);
            System.out.println("Enter Number");
            number = input.nextInt();
            Fourte obj = new Fourte();
            if (number == num1)
            {
                return num1;
            }
            if (number == num2)
            {
                return num2;
            }
            if (number == num3)
            {
                return num3;
            }
            if (number == num4)
            {
                return num4;
            }

        return number;
    }

    void getOperator()
    {
        char operator = input.next().charAt(0);
        switch (operator)
        {
            case '+':
                System.out.println("Add");
                break;
            case '-':
                System.out.println("Sub");
                break;
            case '*':
                System.out.println("Mul");
                break;
            case '/':
                System.out.println("Div");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
    void addition(int num1, int num2, int num3, int num4)
    {

    }
    void subtraction(int num1, int num2, int num3, int num4)
    {

    }
    void multiplication()
    {

    }
    void division()
    {

    }
}




