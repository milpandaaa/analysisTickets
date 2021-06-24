package ru.milpandaaaa.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.milpandaaaa.app.models.ListTickets;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Analysis {

    static public void start(String pathName) throws IOException {
        File file = new File(pathName);
        Analysis.readFile(file);
    }

    static public void readFile(File file) throws IOException {
        StringBuilder str = new StringBuilder();
        BufferedReader b = new BufferedReader(new FileReader(file));
        while (b.ready()) {
            str.append(b.readLine());
        }
        analysis(str.toString());
    }

    static private void analysis(String json){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        ListTickets listTickets = gson.fromJson(json, ListTickets.class);
    }
}
