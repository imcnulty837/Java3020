//Ian McNulty Assignment 2 Problem 17
import java.util.Scanner;

class AssignmentProblem17{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the new width of the number: ");
        int wid = input.nextInt();

        System.out.println("Your new number is " + format(num, wid));
    }

    public static String format(int number, int width) {
        String str = Integer.toString(number);
        if (str.length() < width){
            String temp = "";
            for (int i = 0; i < width - str.length(); i++){
                temp += "0";
            }  
            temp += str;
            return temp;
        }
        return str;
    }
}