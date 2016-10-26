package com.vivas.controller;

import com.vivas.persistent.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    Logger log = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/SpringBoot")
        public String home(Model model){
            List<User> lstUser = new ArrayList<>();
            lstUser.add(new User("duyot","123456a@"));
            model.addAttribute("users", lstUser);
            return "index";

    }
}
