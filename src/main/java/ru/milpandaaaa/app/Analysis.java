package ru.milpandaaaa.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.milpandaaaa.app.models.ListTickets;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Analysis {

    static public void start(String pathName) throws IOException {
        File file = new File(pathName);
        readFile(file);
    }

    public static void readFile(File file) throws IOException {
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
        argTimeVVOandTLV(listTickets);
    }

    static private void argTimeVVOandTLV(ListTickets list){
        AtomicInteger sumTime = new AtomicInteger();
        int countTicket = 0;
        list.getTickets().forEach(ticket -> {
//
                    LocalDate datePartArrival = LocalDate.parse(ticket.getArrivalDate());
                    LocalTime timePartArrival = LocalTime.parse(ticket.getArrivalTime());

                    LocalDateTime dateTimeArrival = LocalDateTime.of(datePartArrival, timePartArrival);

                    LocalDate datePartDeparture= LocalDate.parse(ticket.getDepartureDate());
                    LocalTime timePartDeparture = LocalTime.parse(ticket.getDepartureTime());

                    LocalDateTime dateTimeDeparture = LocalDateTime.of(datePartDeparture, timePartDeparture);

                    sumTime.addAndGet(dateTimeArrival.getHour() - dateTimeDeparture.getHour());
            System.out.println(sumTime);

//                    countTicket++;

//                }
        });
    }

}
