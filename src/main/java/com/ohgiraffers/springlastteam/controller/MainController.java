package com.ohgiraffers.springlastteam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
/*    @GetMapping(value={"/info"})
    public String info() {return "info/info";}*/

    @GetMapping(value={"/fre-ask"})
    public String freask() {return "info/frequentlyAsk";}

    @GetMapping(value={"/prices"})
    public String price() {return "price";}

    @GetMapping(value = {"/contact"})
    public String contact(){return "info/contact";}

    @GetMapping(value = {"/terms"})
    public String terms(){return "document/terms";}

    @GetMapping(value = {"/law"})
    public String law(){return "document/yak";}
}