import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double USD = 3.5260;
        double EUR = 3.6850;
        double amount;
        char op;
        System.out.println("    WELCOME TO OUR CALCULATOR -- HAVE FUN");
        do {
            for (String Menu:Arrays.asList("Press 1 to convert a shekels to dollars",
                    "Press 2 to convert a dollars to shekels",
                    "Press 3 to convert a euro to shekels",
                    "Press 4 to convert a shekels to euros ",
                    "Press 0 to exit")) {
                System.out.println(Menu);
            }
            op = scanner.next().charAt(0);
            switch (op) {
                case '1', '2', '3', '4' -> {
                    System.out.println("enter an amount :");
                    amount = scanner.nextDouble();
                    if (op == '1') System.out.println(amount / USD + "$");
                    if (op == '2') System.out.println(amount * USD + "₪");
                    if (op == '3') System.out.println(amount * EUR + "₪");
                    if (op == '4') System.out.println(amount / EUR + "€");
                }
            }
        } while (op != '0');
        System.out.println("TNX FOR USING GOOD BYE");
        
        

    }
}
