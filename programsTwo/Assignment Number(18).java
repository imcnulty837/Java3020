//Ian McNulty Assignment 2 Problem 18
import java.util.Scanner;

class AssignmentProblem18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++){
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++){
            list2[i] = input.nextInt();
        }

        System.out.print("List1 is ");
        for(int value: list1)
            System.out.print(value + " ");
        
        System.out.println("");
        
        System.out.print("List2 is ");
        for(int value: list2)
            System.out.print(value + " ");

        System.out.println("");

        int[] merged = new int[size1 + size2];
        merged = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int i = 0; i < size1 + size2; i++)
            System.out.print(merged[i] + " ");
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] temp = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++)
            temp[i] = list1[i];
        for (int i = 0; i < list2.length; i++)
            temp[i + list1.length] = list2[i];
        java.util.Arrays.sort(temp);

        return temp;
    }
}