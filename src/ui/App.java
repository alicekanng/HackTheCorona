package ui;


import model.HttpClient;

import java.util.Scanner;

public class App {

    private Scanner input;
    HttpClient httpClient;
//    public store Walmart;
//    public store Superstore;
//    public store SDM;

    public App() {
        httpClient = new HttpClient();
        addAddress();
    }

//    public void runApp() {
//        Walmart = new store("Walmart", 14.99, 19.99,19.99);
//        Superstore = new store("Superstore" , 8.99, 10.49, 14.99);
//        SDM = new store("Shoppers Drug Mart", 0.00, 0.00, 6.99);
//        boolean keepRunning = true;
//
//        while (keepRunning) {
//            options();
//            int option = input.nextInt();
//
//            if (option == 1) {
//
//            }
//
//        }
//    }

    public void addAddress() {
        input = new Scanner(System.in);
        System.out.println("Enter an address");
        String address = input.nextLine();
        try {
            httpClient.placeSearch(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void options() {
//        System.out.println("Which item would you like to find?");
//        System.out.println("1. Face Masks");
//        System.out.println("2. Toilet Paper");
//        System.out.println("3. Hand Sanitizer");
//        System.out.println("4. Quit");
//    }

}
