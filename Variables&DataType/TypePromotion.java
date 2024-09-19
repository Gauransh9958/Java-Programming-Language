public class TypePromotion {
    public static void main(String args[]){
        //EXAMPLE-1

        // char a='a';
        // char b= 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
        // System.out.println(b-a);

        //EXAMPLE-2

        // short a=5;
        // byte b=25;
        // char c='c';
        // byte bt = (byte)(a+b+c);//error is integer to byte conversion is not possible
        // System.out.println(bt);
        


         //EXAMPLE-3
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30 ;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        //EXAMPLE-4
        byte b=5;
        byte a=(byte) (b* 2);
        System.out.println(a);




    }
}
