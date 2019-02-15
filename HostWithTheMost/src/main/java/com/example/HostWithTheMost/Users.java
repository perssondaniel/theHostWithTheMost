package com.example.HostWithTheMost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Users {

    List<User> list = new ArrayList<>();

    public Users() {
        list.add(new User("Test", "Testsson", "0707070707", "191919", "email@email.se", "Street", "123456", "Stockholm", "test", "123"));
        list.add(new User("Daniel", "Persson", "070-070707", "1991/08/22", "daniel@canvas.se", "Flintlåsvägen", "123456", "Sollentuna", "Daniel", "12345"));

    }

    public List<User> getList() {
        return list;
    }

}
