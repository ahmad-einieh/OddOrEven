import java.util.Scanner;

public class TestOfNumber {
    public static void main(String[] args) {
        //by: ahmad einieh
        //input init
        Scanner input = new Scanner(System.in);
        //inti the var
        String num;
        //loop to let app work
        do{
        //get message for input and get input
        System.out.print("enter your number(-1 to close): ");
        num = input.next();
        //manage to close my app
        if (num.equals("-1"))
            continue;
        // take the last number of input
        int number = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
        // test if number is even
        for (int i=0;i<10;i+=2)
            if (number==i)
                System.out.println("even");
        //test number is odd
        for (int i=1;i<10;i+=2)
            if (number==i)
                System.out.println("odd");
        }while (!num.equals("-1"));//when stop app
    }
}
