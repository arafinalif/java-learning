import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner numInput = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        System.out.println("Enter num 1 valule: ");

        num1 = numInput.nextInt();
        System.out.println("Enter num 2 valule: ");
        num2 = numInput.nextInt();
        result = num1 + num2;
        System.out.println("Sum of two num = " + result);

    }
}
