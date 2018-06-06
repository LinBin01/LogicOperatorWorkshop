package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* relational operators < <= > >= == !=

           logic operators && || !
   */
        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");


        if (a == x && y + y == a) {
            System.out.println("Bin");
        }

        if (a == x || y + y == a) {
            System.out.println("Lin");
        }

        if (a != x && y + y == a) {
            System.out.println("dummy Bin");
        }

        if (a < b) {
            // it will run
            System.out.println("a < b");
        }

        if (y <= x) {
            // it will run
            System.out.println("y <= x");
        } else {
            System.out.println("y >= x");
        }

        if (b + a == x) {
            System.out.println("b + a == x");
        }
        if (b * 2 >= x) {
            System.out.println("2b >= x");
        }
        if (2 * a + b > x) {
            System.out.println("2 * a + b > x");
        }

        if (x % b != y) {
            System.out.println("x % b != y");
        }
    }
}
