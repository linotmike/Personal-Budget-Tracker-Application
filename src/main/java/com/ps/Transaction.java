package com.ps;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    private String type;
    private String description;
    private String category;
    private double amount;

    public Transaction (LocalDate date, LocalTime time, String type, String description, String category, double amount ){
        this.date = date;
        this.time = time;
        this.type = type;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalTime getTime(){
        return time;
    }

    public void setTime(LocalTime time){
        this.time = time;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" +
                "date=" + date +
                ", \ntime=" + time +
                ", \ntype='" + type + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \ncategory='" + category + '\'' +
                ", \namount=" + amount +
                '}';
    }
}

