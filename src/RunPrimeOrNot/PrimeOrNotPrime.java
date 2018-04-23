package RunPrimeOrNot;

import javax.swing.*;

public class PrimeOrNotPrime {

    public static void main(String[] args) {
        String in;
        int a;
        boolean pr = true;
        in = JOptionPane.showInputDialog("Enter an integer: ");
        a = Integer.parseInt(in);

        if (a % 2 == 0) {
            pr = false;
        }

        if (pr) {
            System.out.println("\nPrime");
        } else {
            System.out.println("\nNot Prime");
        }
        System.exit(0);
    }

}

//2nd option - without pop up window

//package RunPrimeOrNot;
//
//import javax.swing.*;
//import java.util.Scanner;
//
//public class PrimeOrNotPrime {
//
//    public static void main(String[] args) {
//        Scanner isIt = new Scanner(System.in);
//        int a;
//        System.out.printf("Δώσε έναν ακέραιο αριθμό: ");
//        a = isIt.nextInt();
//        boolean pr = true;
//        if (a % 2 == 0) {
//            pr = false;
//        }
//        if (pr) {
//            System.out.println("\nPrime");
//        } else {
//            System.out.println("\nNotPrime");
//        }
//        System.exit(0);
//    }
//}
