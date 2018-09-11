package lab5;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please, input integers to array.");


        System.out.println("Data in array following.");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        showData (num);

        }

    private static void showData(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
2
        }
    }
}

