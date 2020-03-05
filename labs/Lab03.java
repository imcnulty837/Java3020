// Ian McNulty Lab 3 3/5/2020
import java.util.Scanner;

public class Lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phone number: ");
        String a = input.nextLine();
        if (a.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")){
            String[] b = a.split("[\\(\\)\\s-]+");
            System.out.println("Area Code: " + b[1]);
            System.out.println("Phone Number: " + b[2] + b[3]);
        }
        else{
            System.out.println("Invalid input.");
        }
        input.close();
    }
}