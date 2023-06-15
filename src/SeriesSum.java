import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i = i + 2 ){
            sum = sum + i ;
        }
        System.out.println("Sum of series :" + sum);


    }
    
}
