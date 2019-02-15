package com.example.HostWithTheMost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Controlla2 {

    @Autowired
    private AllEvents allEvents;

    @GetMapping("/newHost")
    String newHost(HttpSession session, Model model) {

        User currentUser = (User)session.getAttribute("user");
        Event event = new Event(currentUser.getFullName(), "noimg");
        session.setAttribute("event", event);
        model.addAttribute("event", event);
        return "newHost";
    }

    @PostMapping("/newHost")
    String newHost1(HttpSession session, Model model, @ModelAttribute Event event){

        session.setAttribute("event", event);
        model.addAttribute("event", event);
        event.setUrl("noimg");
        allEvents.list.add(event);

        return "newHost";
    }

    @GetMapping("/newGuest")
    String newGuest(Model model, HttpSession session){

        model.addAttribute("allEvents", allEvents.list);

        return "newGuest";
    }

    @GetMapping("/event/{eventId}")
    String eventDetail(HttpSession session, Model model, @PathVariable String eventId){

        int id = Integer.parseInt(eventId);

        for(Event e: allEvents.list){
            if(e.getId() == id){
                model.addAttribute("event", e);
            }
        }

        return "eventGuest";
    }


}
