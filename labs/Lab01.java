// Ian McNulty Java Lab 1
import java.util.Scanner;

public class Lab01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int num = input.nextInt();
        int[] index = new int[1];

        System.out.print("Enter the coordinates of those citys: ");
        double[][] cities = new double[num][3];
        for (int i = 0; i < num; i++){
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        double[] central = findCentral(cities, num, index);
        System.out.println("The central city is at (" + central[0] + ", " + central[1] + ").");

        System.out.printf("The total distance to all other cities is %.2f", cities[index[0]][2]);
    }

    public static double[] findCentral(double[][] a, int size, int[] index){
        double[] loc = new double[2];

        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++)
                if(i != j)
                    a[i][2] += Math.sqrt(a[i][0] * a[i][1] + a[j][0] * a[j][1]);
        }

        double[] test = a[0];
        index[0] = 0;
        for (int i = 1; i < size; i++){
            if (test[2] > a[i][2]){
                test = a[i];
                index[0] = i;
            }
        }

        loc = test;

        return loc;
    }
}