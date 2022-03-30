import java.util.Scanner;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
        int[] arr= {1, 2, 3, 4, 5};
        int k= sc.nextInt();
        for(int i=0; i< arr.length; i++)
        {
            for(int j=i+1; j<arr.length ; j++)
            {
                if((arr[i] + arr[j]) % k == 0)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }
}
