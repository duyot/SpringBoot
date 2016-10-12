package com.vivas.controller;

import com.vivas.persistent.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duyot on 10/12/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/SpringBoot")
    public String home(Model model){
        List<User> lstUser = new ArrayList<>();
        lstUser.add(new User("duyot","123456a@"));
        model.addAttribute("users", lstUser);
        return "index";

    }
}
