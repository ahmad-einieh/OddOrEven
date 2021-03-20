import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        String num = input.next();
        int number = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
        for (int i=0;i<10;i+=2)
            if (number==i)
                System.out.println("even");
        for (int i=1;i<10;i+=2)
            if (number==i)
                System.out.println("odd");
    }
}

