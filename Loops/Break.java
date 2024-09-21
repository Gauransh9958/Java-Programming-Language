import java.util.Scanner;

public class Break {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
    // for(int i=1; i<=5; i++){
    //     if (i == 3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("i am out of the loop")
do{
    System.out.println("Enter your Number: ");
    int n = sc.nextInt();
    if(n%10==0){
        break;
    }
    System.out.println(n);
}while(true);


















    }
    }