import java.util.Scanner;

public class FindThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = scanner.nextInt();
        int biggest;
        if (num1 > num2 &&  num1 > num3) {
            biggest = num1;
        } else if (num2 > num1 && num2 > num3) {
            biggest = num2;
        } else {
            biggest = num3;
        }
        System.out.println("The biggest number is: " + biggest);
    }
}
