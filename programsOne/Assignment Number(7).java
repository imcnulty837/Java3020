// Ian McNulty Problem 7 1/27/2020
import java.util.Scanner;

class Ian_McNulty_AssignOne_Problem7
{
    public static void main(String[] args){
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String letters = "JFMASOND";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        char test = month.charAt(0);
        
        if(month.length() != 3 || !Character.isUpperCase(test) || !letters.contains(Character.toString(test)))
            System.out.println(month + " is not a correct month name");
        else{
            char c1, c2, c3;
            c1 = month.charAt(0);
            c2 = month.charAt(1);
            c3 = month.charAt(2);
            switch(c1){
                case 'J':
                    switch(c2){
                        case 'a':
                            System.out.println(month + " " + year + " has " + days[1] + " days");
                            break;
                        case 'u':
                            switch(c3){
                                case 'n':
                                    System.out.println(month + " " + year + " has " + days[6] + " days");
                                    break;
                                case 'l':
                                    System.out.println(month + " " + year + " has " + days[7] + " days");
                                    break;
                            }
                            break;
                    }
                    break;
                case 'F':
                    if (year % 4 == 0)
                        days[2] += 1;
                    System.out.println(month + " " + year + " has " + days[2] + " days");
                    break;
                case 'M':
                    switch(c3){
                        case 'r':
                            System.out.println(month + " " + year + " has " + days[3] + " days");
                            break;
                        case 'y':
                            System.out.println(month + " " + year + " has " + days[5] + " days");
                            break;
                    }
                    break;
                case 'A':
                    switch(c2){
                        case 'p':
                            System.out.println(month + " " + year + " has " + days[4] + " days");
                            break;
                        case 'u':
                            System.out.println(month + " " + year + " has " + days[8] + " days");
                            break;
                    }
                    break;
                case 'S':
                    System.out.println(month + " " + year + " has " + days[9] + " days");
                    break;
                case 'O':
                    System.out.println(month + " " + year + " has " + days[10] + " days");
                    break;
                case 'N':
                    System.out.println(month + " " + year + " has " + days[11] + " days");
                    break;
                case 'D':
                    System.out.println(month + " " + year + " has " + days[12] + " days");
                    break;
            }
        }
    }
}