import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = obj.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote in a national election.");
        } else {
            System.out.println("You are not eligible to vote in a national election.");
        }
    }
}
