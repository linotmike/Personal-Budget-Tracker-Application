package com.ps;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Transaction> transactionArrayList = new ArrayList<>();
    static LocalDate date = LocalDate.now();
    static LocalTime time = LocalTime.now();

    public static void main(String[] args) {
        homeScreen();


    }


    public static void homeScreen() {
        int mainMenuCommand;
        do {
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

            switch (mainMenuCommand) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    //addExpense();
                    break;
                case 3:
                    //viewBudgetStatus();
                    break;
                case 4:
                    ledgerScreen();
                    break;
                case 5:
                    reportScreen();
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

        } while (mainMenuCommand != 0);

    }

    public static void ledgerScreen() {
        int subMenuCommand;

        do {
            System.out.println("Welcome to the ledger Screen");
            System.out.println("1) All entries");
            System.out.println("2) Income");
            System.out.println("3) Expenses");
            System.out.println("4) Reports");
            System.out.println("5) Home");
            subMenuCommand = commandScanner.nextInt();

            switch (subMenuCommand) {
                case 1:
                    //allEntries();
                    break;
                case 2:
                    //income();
                    break;
                case 3:
                    //expenses();
                    break;
                case 4:
                    reportScreen();
                    break;
                case 5:
                    System.out.println("Going back to home Screen");
                    break;
                default:
                    System.out.println("command not found");

            }


        } while (subMenuCommand != 5);
    }

    public static void reportScreen() {
        int menuCommand;
        do {
            System.out.println("Welcome to The reports screen");
            System.out.println("Please choose what you would like to see");
            System.out.println("1) Total income for Month");
            System.out.println("2) Total expenses for Month");
            System.out.println("3) Expenses by category");
            System.out.println("4) Income and expenses summary");
            System.out.println("5) Search by Date Range");
            System.out.println("0) Back");
            menuCommand = commandScanner.nextInt();

            switch (menuCommand) {
                case 1:
                    //totalIncomeForMonth();
                    break;
                case 2:
                    //totalExpensesForMonth();
                    break;
                case 3:
                    //expensesByCategory();
                    break;
                case 4:
                    //incomeAndExpensesSummary();
                    break;
                case 5:
                    //searchByDateRange();
                    break;
                case 0:
                    System.out.println("You choose to go back");
                default:
                    System.out.println("Command not found please try again");


            }


        } while (menuCommand != 0);

    }

    public static void addIncome() {
        System.out.println("please enter the type");
        String type = inputScanner.nextLine();
        System.out.println("Please enter the description");
        String description = inputScanner.nextLine();
        System.out.println("please enter the category");
        String category = inputScanner.nextLine();
//        System.out.println("please enter the amount");
//        inputScanner.nextLine();
        double amount;
        do {
            System.out.println("Please enter the amount");
            amount = inputScanner.nextDouble();
            if (amount <= 0) {
                System.out.println("please enter a positive number");
            }
        } while (amount <= 0);
    Transaction income = new Transaction(date,time,type,description,category,amount);
    transactionArrayList.add(income);
    System.out.println("Income successfully added!\nHere are the details: \n" + income);
    }


}