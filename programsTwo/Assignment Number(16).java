//Ian McNulty Assignment 2 Problem 16
import java.util.Scanner;

class AssignmentProblem16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        String pre = "";
        int i = 0;
        do {
            pre += s1.charAt(i);
            i++;
        } while (s1.charAt(i) == s2.charAt(i));

        System.out.println("The common prefix is " + pre);
    }
}