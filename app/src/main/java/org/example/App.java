package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Factorizer factorizer = new Factorizer();

    System.out.println("Welcome to the Prime Factor Program!");
    System.out.println("Please enter an integer:");
    int number = scanner.nextInt();

    ArrayList<Integer> factors = factorizer.primeFactors(number);

    System.out.println("The prime factors of " + number + " are:");
    System.out.println(factors);

    System.out.println();
    System.out.println("Thank you for using the Prime Factor Program!");


    scanner.close();
  }
  }