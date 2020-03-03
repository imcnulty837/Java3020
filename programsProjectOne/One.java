// Ian McNulty Project 1 Program 1 3/3/2020
import java.util.Scanner;

class One{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = input.nextInt(); // Rows and Columns can be any size
        int columns = input.nextInt(); // The size restriction is the default case of the isConsecutiveFour function
        int[][] arr = new int[columns][rows];

        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < rows; i++){ // Rows first so it reads the entries left to right and top to bottom
            for(int j = 0; j < columns; j++){
                arr[j][i] = input.nextInt();
            }
        }

        System.out.println("Answer is: " + isConsecutiveFour(arr));
    }

    public static boolean isConsecutiveFour(int[][] arr){
        boolean flag = false; // Default case

        for(int i = 0; i < arr.length; i++){ // Checks matrix if true
            for(int j = 0; j < arr[i].length; j++){ 
                if(arr.length >= 4 && i >= 3){ // Horizontal Check
                    if(arr[i][j] == arr[i-1][j] && arr[i][j] == arr[i-2][j] && arr[i][j] == arr[i-3][j]){
                        return true;
                    }
                }
                if(arr[i].length >= 4 && j >= 3){ // Vertical Check
                    if(arr[i][j] == arr[i][j-1] && arr[i][j] == arr[i][j-2] && arr[i][j] == arr[i][j-3]){
                        return true;
                    }
                }
                if(arr[i].length >= 4 && arr.length >= 4 && i >= 3){ // Diagonal Checks
                    if(j <= arr[i].length - 4){// Check if able to traverse 4 indexes to the right
                        if(arr[i][j] == arr[i-1][j+1] && arr[i][j] == arr[i-2][j+2] && arr[i][j] == arr[i-3][j+3]){
                            return true;
                        }
                    }
                    if(j >= arr[i].length - 1){// Check if able to traverse 4 indexes to the right
                        if(arr[i][j] == arr[i-1][j-1] && arr[i][j] == arr[i-2][j-2] && arr[i][j] == arr[i-3][j-3]){
                            return true;
                        }
                    }
                }
            }
        }

        return flag;
    }
}