package edu.fci;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    int a;
    float f;
    String s;
    public static void main(String[] args) throws InterruptedException {
        Die d = new Die(6);
        for (int i = 0; i < 5; i++) {
            System.out.println("Round "+(i+1));
            d.Roll();
            System.out.println(d.getValue());
            TimeUnit.SECONDS.sleep(1);

        }
        /*int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        m= input.nextInt();
        System.out.println("m = "+m);

        Student s = new Student("Ahmed", 30, 40, 50, 60);
        System.out.println(s.getAge());
        s.printInfo();*/

	    // System.out.println("Hello World");
    }
}



