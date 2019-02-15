package com.example.HostWithTheMost;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllEvents {

    public List<Event> list = new ArrayList<>();

    public AllEvents() {
        list.add(new Event("Dinner", "Hammarby, Stockholm", "16:00", "15/02/2019", "17", "Potatos", "49:-", "Water and snacks", "Ståle Snåling", "stale"));
        list.add(new Event("Dinner", "Bromma, Stockholm", "18:00", "22/02/2019", "8", "Swedish fest", "100:-", "Sombrero and/or Tequila", "Anna Ahlsing", "anna"));
        list.add(new Event("Dinner", "Sundbyberg, Stockholm", "12:00", "01/04/2019", "16", "Lunch", "120:-", "Java skills", "Swen Bank", "swen"));
        list.add(new Event("Dinner", "Odenplan, Stockholm", "03:00", "31/04/2019", "2", "After party food", "89:-", "-", "Sibylla Jonsson","sibylla"));
    }
}
