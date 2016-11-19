package secretlabproject;

import java.util.Scanner;

public class SecretLabProject {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wlecome To SecretLab Program");
        System.out.print("What is your name? : ");
        String name = s.next();
        System.out.println("Welcome " + name + ".");
        int choice = 1;
        while (choice != 0) {
            if (choice > 5 || choice < 0) {
                System.out.println("INVALID NUMBER!!");
            }
            System.out.print("***MAIN MENU***\n1- Heat degree Convertion\n2- Divisibility\n3- Numbers\n4- Sequence of numbers\n5- String reversal\n0- Exit\nEnter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter heat degree value: ");
                    int degree = s.nextInt();
                    System.out.print("1- Fahrenheit to Celcious\n2- Celcious to Fahrenheit\n0- Exit to main menu\nEnter your choice: ");
                    int user = s.nextInt();
                    if (user == 1) {
                        System.out.println(degree + " Fahrenheit = " + (degree / 33.8) + " Celcius");

                    }
                    if (user == 2) {
                        System.out.println(degree + " Celcious = " + (degree * 33.8) + " Fahrenheit");
                    }
                    if (user == 0) {

                    }
                    break;
                case 2:
                    System.out.print("Enter two integer :");
                    int x = s.nextInt();
                    int y = s.nextInt();
                    int remain = 0;
                    if (x % y == 0) {
                        System.out.println(x + " divisible by " + y + " number");
                    } else if (x % y != 0) {
                        remain = x % y;
                        System.out.println(x + " not divisible without remain by " + y + " and remain " + remain);
                    }
                    break;
                case 3:
                    System.out.print("Enter an integer: ");
                    int integer = s.nextInt();
                    System.out.print("1- Even or Odd ?\n2- Sum of all digits\n3- Is prime?\n4- Prime factors\n5- Factorial\n0- Exit to main menu\nEnter your choice: ");
                    int input = s.nextInt();
                    if (input == 1) {
                        if (integer % 2 == 0) {
                            System.out.println(integer + " is even");
                        } else if (integer % 2 != 0) {
                            System.out.println(integer + " is odd");
                        }
                    }
                    if (input == 2) {
                        int sum = 0;
                        while (integer > 0) {
                            int digit = integer % 10;
                            sum += digit;
                            integer = integer / 10;
                        }
                        System.out.println("Sum of all digits: " + sum);
                    }
                    if (input == 3) {
                        boolean prime = true;
                        for (int i = 2; i < integer / 2; i++) {
                            if (integer % i == 0) {
                                prime = false;
                            }
                        }
                        if (prime) {
                            System.out.println("Number is prime");
                        } else {
                            System.out.println("Number is not prime");
                        }
                    }
                    if (input == 4) {
                        int factor = 2;
                        while (integer > 1) {
                            if (integer % factor == 0) {
                                integer = integer / factor;
                                System.out.print(factor + " ");
                            } else {
                                factor += 1;
                            }
                        }
                        System.out.println();
                    }
                    if (input == 5) {
                        int factorial = 1;
                        for (int i = 1; i <= integer; i++) {
                            factorial *= i;

                        }
                        System.out.println(integer + "! = " + factorial);
                    }
                    if (input == 0) {

                    }

                    break;

                case 4:
                    System.out.print("1- Sum of all\n2- Average of all\n3- Fibonacci\n4- Even - Odds\n0- Exit to main menu\nEnter your choice: ");
                    int userIn = s.nextInt();
                    if (userIn == 1) {
                        System.out.print("Enter an integer: ");
                        int N = s.nextInt();
                        int sum = 0;
                        for (int i = 0; i <= N; i++) {
                            sum += i;
                        }
                        System.out.println("The sum of all numbers: " + sum);
                    }
                    if (userIn == 2) {
                        int N = 1;
                        int sum = 0;
                        int counter = 0;
                        while (N != 0) {
                            System.out.print("Enter an integer: ");
                            N = s.nextInt();
                            sum += N;
                            counter += 1;

                        }
                        System.out.println("The average of these numbers: " + (sum / counter));
                    }
                    if (userIn == 3) {
                        System.out.print("Enter an integer: ");
                        int N = s.nextInt();
                        int d1 = 1;
                        int d2 = 1;
                        int d3;
                        System.out.print(d1 + " " + d2 + " ");
                        for (int i = 0; i < N; i++) {
                            d3 = d2 + d1;
                            d1 = d2;
                            d2 = d3;
                            System.out.print(d3 + " ");

                        }
                        System.out.println();
                    }
                    if (userIn == 4) {
                        System.out.print("Enter an integer: ");
                        int N = s.nextInt();
                        int evensum = 0;
                        int oddsum = 0;
                        for (int i = 0; i < N; i++) {
                            if (i % 2 == 0) {
                                evensum += i;
                            }
                            if (i % 2 != 0) {
                                oddsum += i;
                            }
                        }
                        System.out.println("Difference of all even and odd numbers: " + (evensum - oddsum));
                    }
                    if (userIn == 0) {

                    }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String word = s.next();
                    for (int i = word.length() - 1; i >= 0; i--) {
                        System.out.print(word.charAt(i));
                    }
                    System.out.println();
                    break;
                case 0:
                    break;
            }

        }
        System.out.println("Goodbye " + name);

    }
}
