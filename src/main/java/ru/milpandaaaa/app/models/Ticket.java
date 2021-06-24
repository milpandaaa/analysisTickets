package ru.milpandaaaa.app.models;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ticket {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("origin_name")
    @Expose
    private String originName;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("destination_name")
    @Expose
    private String destinationName;
    @SerializedName("departure_date")
    @Expose
    private String departureDate;
    @SerializedName("departure_time")
    @Expose
    private String departureTime;
    @SerializedName("arrival_date")
    @Expose
    private String arrivalDate;
    @SerializedName("arrival_time")
    @Expose
    private String arrivalTime;
    @SerializedName("carrier")
    @Expose
    private String carrier;
    @SerializedName("stops")
    @Expose
    private int stops;
    @SerializedName("price")
    @Expose
    private int price;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

