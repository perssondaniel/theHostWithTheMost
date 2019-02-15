package com.example.HostWithTheMost;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class Event {
    private String eventType;
    private String location;
    private String time;
    private String date;
    private String numOfGuests;
    private String menu;
    private String price;
    private String whatToBring;
    private int id;
    private String host;
    private String url;


    public Event() {
    }

    public Event(String host, String url) {
        this.host = host;
        this.url = url;
        this.id = ThreadLocalRandom.current().nextInt(1,9999);
    }

    public Event(String eventType, String location, String time, String date, String numOfGuests, String menu, String price, String whatToBring, String host, String url) {
        this.eventType = eventType;
        this.location = location;
        this.time = time;
        this.date = date;
        this.numOfGuests = numOfGuests;
        this.menu = menu;
        this.price = price;
        this.whatToBring = whatToBring;
        this.id = ThreadLocalRandom.current().nextInt(1,9999);
        this.host = host;
        this.url = url;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(String numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWhatToBring() {
        return whatToBring;
    }

    public void setWhatToBring(String whatToBring) {
        this.whatToBring = whatToBring;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
