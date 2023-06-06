public class FindThreeNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int biggest;

        if (num1 >= num2 && num1 >= num3) {
            biggest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            biggest = num2;
        } else {
            biggest = num3;
        }

        System.out.println("The biggest number is: " + biggest);

    }
}
