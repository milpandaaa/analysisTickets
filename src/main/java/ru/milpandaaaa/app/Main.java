package ru.milpandaaaa.app;

class Main{
    public static void main(String[] args) {
        try {
            Analysis.start("D:\\GoogleChomeDownloads\\tickets.json");
        }
        catch (Exception e){
           e.printStackTrace();
        }
    }
}