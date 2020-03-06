// Ian McNulty Assignment 5 Problem 11 3/5/2020
import java.util.ArrayList;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        ArrayList<Integer> b = new ArrayList<Integer>(5);
        System.out.print("Enter five integers for list one: ");
        for (int i = 0; i < 5; i++){
            a.add(input.nextInt());
        }

        System.out.print("Enter five integers for list two: ");
        for (int i = 0; i < 5; i++){
            b.add(input.nextInt());
        }

        ArrayList<Integer> newList = union(a, b);
        System.out.print("The combined list is ");
        for (int i = 0; i < newList.size(); i++){
            System.out.print(newList.get(i) + " ");
        }

        input.close();
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> temp = new ArrayList<Integer>(list1.size() + list2.size());
        for (int i = 0; i < list1.size() + list2.size(); i++){
            if (i < list1.size()){
                temp.add(list1.get(i));
            }
            else{
                temp.add(list2.get(i - list2.size()));
            }
        }

        return temp;
    }
}