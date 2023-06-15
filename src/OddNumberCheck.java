import java.util.Scanner;

public class OddNumberCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("Even number"); 
        }else{
            System.out.println("Odd number");
        }



    }

    
}
