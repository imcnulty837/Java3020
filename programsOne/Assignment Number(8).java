// Ian McNulty Problem 8 1/27/2020
import java.util.Scanner;

class Ian_McNulty_AssignOne_Problem8
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        if (ssn.length() != 11)
            System.out.println(ssn + " is an invalid Social Security Number ");
        else 
            System.out.println(ssn + " is a valid Social Security Number");
    }
}