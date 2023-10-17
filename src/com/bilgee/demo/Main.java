package com.bilgee.demo;



import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner( System.in );

        while (true) {
            System.out.println( "Shopping List app" );
            System.out.println("<<<<<>>>>>>>>>>>>>>>");
            System.out.println( "1. Add Product" );
            System.out.println("<<<<<>>>>>>>>>>>>>>>");
            System.out.println( "2. Remove Product" );
            System.out.println("<<<<<>>>>>>>>>>>>>>>");
            System.out.println( "3. Display shopping List" );
            System.out.println("<<<<<>>>>>>>>>>>>>>>");
            System.out.println( "4. Quit" );

            System.out.println( "Enter your choice: " );
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println( "Enter the product to add: " );
                    String product = scanner.nextLine();
                    shoppingList.add( product );
                    System.out.println( product + " has been added to the shopping list. " );
                    System.out.println("<<<>>>");
                }
                case 2 -> {
                    if (shoppingList.isEmpty()) {
                        System.out.println( "Shopping list is empty." );
                    } else {
                        System.out.println( "Current Shopping list: " );
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println( (i + 1) + " . " + shoppingList.get( i ) );
                        }
                        System.out.println( "Enter the index of the product to remove: " );
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if (index >= 1 && index <= shoppingList.size()) {
                            String removeProduct = shoppingList.remove( index );
                        } else {
                            System.out.println( "Invalid index. No product to removed. " );
                        }

                    }
                }
                case 3 -> {
                    if (shoppingList.isEmpty()) {
                        System.out.println( "Shopping list is empty." );
                    } else {
                        System.out.println( "Current Shopping list:" );
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println( (i + 1) + " . " + shoppingList.get( i ) );
                        }

                    }
                }
                case 4 -> {
                    System.out.println( "Bye" );
                    scanner.close();
                    System.exit( 0 );
                }
                default -> System.out.println( "Invalid choice. Please enter a valid option." );
            }


        }

    }
}