import java.util.Scanner;

public class addnumString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number string: ");
        String inputString1 = scanner.nextLine();

        System.out.print("Enter 2nd number string: ");
        String inputString2 = scanner.nextLine();

        
            int num1 = Integer.parseInt(inputString1);
            int num2 = Integer.parseInt(inputString2);

            int sum = num1 + num2;
            System.out.println("Sum is : " + sum);
        
    }
}
