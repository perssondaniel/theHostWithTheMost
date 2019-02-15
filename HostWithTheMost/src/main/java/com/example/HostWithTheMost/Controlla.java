package com.example.HostWithTheMost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;


@Controller
public class Controlla {

    @Autowired
    private Users users;

    @GetMapping("/")
    String main(){
        return "loginPage";
    }

    @PostMapping("/")
    String mainLogin(HttpSession session, Model model, @RequestParam(required = false, defaultValue = "potato") String username, @RequestParam(required = false, defaultValue = "potatoFarmer") String password){

        for (int i = 0; i < users.list.size(); i++){
            if(username.equals(users.list.get(i).getUserName()) && password.equals(users.list.get(i).getPassWord())){
                session.setAttribute("user", users.list.get(i));
                return "home";
            }
        }
        return "loginPage";
    }

    @GetMapping("/register")
    String register(HttpSession session, Model model){

        if(session.getAttribute("user") == null) {
            User user = new User();
            session.setAttribute("user", user);
            model.addAttribute("user", user);
        }

        return "register";
    }

    @PostMapping("/register")
    String register1(HttpSession session, Model model, @ModelAttribute User user){


        model.addAttribute("user", user);
        session.setAttribute("user", user);
        user.getDetails();
        users.list.add(user);
        session.setAttribute("users", users);

      return "register";
    }

    @GetMapping("/profile")
    String profile(HttpSession session, Model model){

        model.addAttribute((User)session.getAttribute("user"));

        return "profile";
    }

    @PostMapping("/profile")
    String profileEdit(Model model, HttpSession session, @ModelAttribute User user){

        session.setAttribute("user", user);
        model.addAttribute("user", user);

        for(int i = 0; i < users.list.size(); i++){
            for(int j = 0; j < users.list.size(); j++ ){

                if(users.list.get(i).getUserName().equals(users.list.get(j).getUserName())){
                    users.list.add(i, user);
                }
            }
        }
        return "profile";
    }
}
