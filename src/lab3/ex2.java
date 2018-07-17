package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int x,y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer 1: ");
        x = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        y = scanner.nextInt();

        if (x>y){
            System.out.println(x+" มากกว่า "+y);
        }else {
            System.out.println(y+" มากกว่า "+x);
        }



    }//main
}//class
