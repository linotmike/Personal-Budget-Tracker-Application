package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);

public static void main (String [] args){

    int mainMenuCommand;

    do{
        System.out.println("Welcome to the personal Budget Application");
        System.out.println("Please choose what you would like to do");
        System.out.println("1) Add Income");
        System.out.println("2) Add Expense");
        System.out.println("3) View Budget status");
        System.out.println("4) View Ledger screen");
        System.out.println("5) view Reports Screen");
        System.out.println("6) Set Monthly Budget");
        System.out.println("0) Exit");

        mainMenuCommand = commandScanner.nextInt();

        switch(mainMenuCommand){
            case 1:
                //addIncome();
                break;
            case 2:
                //addExpense();
                break;
            case 3:
                //viewBudgetStatus();
                break;
            case 4:
                //ledgerScreen();
                break;
            case 5:
                //reportsScreen();
                break;
            case 6:
                //setMonthlyBudget();
                break;
            case 0:
                System.out.println("You choose to Exit");
                break;
            default:
                System.out.println("Invalid command");

        }

    }while(mainMenuCommand != 0);
}
}