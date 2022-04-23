package interview2;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Students");
        int noOfStudents= sc.nextInt();
        int newGrade;
        int[] grades= new int[noOfStudents];
        System.out.println("Enter the grades");
        for(int i=0; i<grades.length; i++)
        {
            grades[i] = sc.nextInt();
            if(grades[i] >= 38)
            {
                if(grades[i] % 5 ==0)
                {
                    System.out.println(grades[i]);
                }
                else
                {
                    if(grades[i] % 10 > 5 && grades[i] > 40)
                    {
                        System.out.println(grades[i]);
                    }
                    else {
                        int j = 1;
                        while (j <= 3) {
                            newGrade = grades[i] + j;
                            if (newGrade % 5 == 0) {
                                System.out.println(newGrade);
                            }
                            j++;
                        }
                    }
                }
            }
            else
            {
                System.out.println(grades[i]);
            }
        }
    }
}
