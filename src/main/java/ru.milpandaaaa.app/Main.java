package ru.milpandaaaa.app;

import java.io.File;

class Main{
    public static void main(String[] args) {
        try {
            Analysis.start("D:\\GoogleChomeDownloads\\tickets.json");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}