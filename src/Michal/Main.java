package Michal;

import java.security.PublicKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n This is a collection of coding interview practice questions." +
                "\n This project includes implementation of algorithms, as well as data structures knowledge. ");

        int exNumber = 0;
        Scanner in = new Scanner(System.in);
        int a = 9, b = 5;
        System.out.println(a/b);
        System.out.println("\nEnter the ex. number for activation: ");
        exNumber = in.nextInt();

        switch (exNumber){
            case 1 :
                Recursion recursion = new Recursion();
                System.out.println(recursion.sum(5));
                    break;
            case 2: StringManipulation stringManipulation = new StringManipulation();
                    stringManipulation.permutation("ABC");
                break;
        }

        recursionInLoop(532 );
    }

    public  static void recursionInLoop (int num){
        if (num % 10 == 0 ){
            return;
        }

        for (int i = 0; i <= 2; i++){
            System.out.println( num % 10);
            recursionInLoop ( num/10 );
        }
    }
}
