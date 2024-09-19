import java.util.Scanner;

public class TypeConversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // EXAMPLE-1

    //    is case me conversion ho jayega
        // int a = 25;
        // long b = a;

     // is case me conversion nahi hoga
    // long a = 25;
    //     int b = a;
        // System.out.println(b);


        // EXAMPLE-2

 // ye code bhirun nhi krega kuki hum float ko integer me assign nhi kr sakte
// int number = sc.nextFloat();
//     System.out.println(number);

    // ye code run kr jayega kuki hum integer ko float me assign kr sakte h
    float number = sc.nextInt();
        System.out.println(number);
    }
    
}
