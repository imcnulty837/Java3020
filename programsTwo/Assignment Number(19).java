//Ian McNulty Assignment 2 Problem 19
import java.util.Scanner;

class AssignmentProblem19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int size = input.nextInt();
        double[][] mat1 = new double[size][size];
        double[][] mat2 = new double[size][size];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                mat2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 1: ");
        print(mat1, size);

        System.out.println("Matrix 2: ");
        print(mat2, size);

        double[][] newMat = addMatrix(mat1, mat2);
        System.out.println("Matrix 1 and 2 added together: ");
        printAdd(mat1, mat2, newMat, size);
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] newMat = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                newMat[i][j] = a[i][j] + b[i][j];
            }
        }

        return newMat;
    }

    public static void print(double[][] a, int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void printAdd(double[][] a, double[][] b, double[][] c, int size){
        for (int i = 0; i < size; i++){

            String str1 = "    ", str2 = "    ";
            if (i == size - 1){
                str1 = " +  ";
                str2 = " =  ";
            }

            for (double value : a[i]){
                System.out.print(value + " ");
            }
            System.out.print(str1);
            for (double value : b[i]){
                System.out.print(value + " ");
            }
            System.out.print(str2);
            for (double value : c[i]){
                System.out.print(value + " ");
            }

            System.out.println("");
        }
    }
}