import java.util.*;
public class PraticeSheet{
    public static void main(String args[]){


// ANSWER-2





// ANSWER-3
// Write a java program to input week number (1-7) and print a day of week name usinhg switch case

// Scanner sc = new Scanner (System.in);

// System.out.println("Enter the Number: ");
// int week = sc.nextInt();

// switch(week) {
//             case 1 -> System.out.println("Monday");
//             case 2 -> System.out.println("Tuesday");
//             case 3 -> System.out.println("Wednesday");
//             case 4 -> System.out.println("Thrusday");
//             case 5 -> System.out.println("Friday");
//             case 6 -> System.out.println("Saturday");
//             case 7 -> System.out.println("Sunday");
//             default -> System.out.println("Nahi hota h bhai");
//             }











//ANSWER-5

Scanner sc = new Scanner (System.in);
System.out.println("Input the Year : ");
int year = sc.nextInt();

boolean x = (year%4)==0;

boolean y = (year%100) !=0;

boolean z = ((year%100 ==0) && (year%400 ==0));

if (x && (y||z)) {
    System.out.println(year +" is a leap year");
}
else{
    System.out.println(year + "is not a leap year");
}


























}











    }
    


