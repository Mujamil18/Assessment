import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1= sc.nextLine();
        System.out.println("Enter the second String");
        String str2= sc.nextLine();
        int count=0;
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        for(int i=0; i<str1.length() ; i++)
        {
            for(int j=0; j<str2.length(); j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count==str2.length())
        {
            System.out.println("The Strings are Anagram");
        }
        else
        {
            System.out.println("The Strings are not Anagram");
        }

    }
}
