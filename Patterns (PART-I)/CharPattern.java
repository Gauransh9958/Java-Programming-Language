
import java.util.*;

public class CharPattern{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// print char pattern by taking char as input


System.out.println("Enter the value of n : ");
    int n =sc.nextInt();
        char ch = 'A';
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
            }
System.out.println();

        }
    }
}