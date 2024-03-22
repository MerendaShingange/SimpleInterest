/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinterest;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class SimpleInterest {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal Amount (P): ");
        double P = scanner.nextDouble();

        System.out.println("Enter the Number of Years (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the Rate of Interest (R): ");
        double R = scanner.nextDouble();

        // Calculate Simple Interest
        double SimpleInterest = (P * N * R) / 100;

        // Print result
        System.out.println("Simple Interest: " + SimpleInterest);
}
}
