package interview2;

import java.text.ParseException;
import java.util.Scanner;

public class Program2
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in milliseconds");
        long milliseconds = sc.nextLong();
        findRelativeTime(milliseconds);
    }
    public static void findRelativeTime(long milliseconds)
    {
        long second= 1000L;
        long minute= 60 * second;
        long hour= 60 * minute;
        long day = 24 * hour;
        long month= 30 * day;
        long year= 365 * day ;
//        System.out.println(minute);
//        System.out.println(hour);
//        System.out.println(day);
//        System.out.println(month);
//        System.out.println(year);

        long rel_time;
        int timeAgo;
        long currentTime= System.currentTimeMillis();
        long difference= currentTime - milliseconds;
        if(difference < minute)
        {
            System.out.println("Just now");
        }
        else if(difference < hour)
        {
            rel_time = difference / minute;
            timeAgo= (int) rel_time;
            System.out.println(timeAgo + " minutes ago");
        }
        else if(difference < day)
        {
            rel_time = difference / hour;
            timeAgo = (int) rel_time;
            System.out.println(timeAgo + " hours ago");
        }
        else if(difference < month)
        {
            rel_time = difference / day;
            timeAgo = (int) rel_time;
            System.out.println(timeAgo +  " days ago");
        }
        else if(difference < year)
        {
            rel_time = difference / month;
            timeAgo = (int) rel_time;
            System.out.println(timeAgo + " months ago");
        }
        else
        {
            rel_time = difference / hour;
            timeAgo = (int) rel_time;
            System.out.println(timeAgo + " year ago");
        }
    }
}
