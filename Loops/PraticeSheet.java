import java.util.*;
public class PraticeSheet{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

// Ques-1  

// Ans-1 : The Answer for  ques 1 is 2 times.



// QUES-2    Write a program that reads a set of integers,and then prints the sum of the even and odd integers

        int evenSum = 0;
        int oddSum = 0;
        
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        
        sc.close();
    }
}










// // ANSWER-3      Write a program to find the factori alof any number entered by the user


// int number =sc.nextInt();
// int fact = 1;

// for(int i=1; i<=number; i++){
//     fact *=i;
// }
// System.out.println("Factorial : " + fact);
// }}







// QUES-4 Write a program to print the multiplication table of a number N , entered by the user

// int number = sc.nextInt();

// for (int i = 1; i <= 10; i++) {
//     System.out.println(number + "*" + i + "=" + number * i);
// }}}
