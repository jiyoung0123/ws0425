package com.kbstar.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller

public class MainController {
    @RequestMapping("/")
    public String main(){

        return "index";
    }

    @RequestMapping("/charts")
    public String chart(Model model){
        model.addAttribute("center","charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        List <Item> list = new ArrayList<>();
        list.add(new Item("james1","manager","a.jpg",10, new Date(),1000));
        list.add(new Item("james2","manager","b.jpg",20, new Date(),2000));
        list.add(new Item("james3","manager","c.jpg",30, new Date(),3000));
        list.add(new Item("james4","manager","d.jpg",40, new Date(),1000));
        list.add(new Item("james5","manager","e.jpg",50, new Date(),1000));
        list.add(new Item("james6","manager","f.jpg",60, new Date(),1000));
        list.add(new Item("james7","manager","g.jpg",70, new Date(),1000));
        list.add(new Item("james8","manager","h.jpg",80, new Date(),1000));
        list.add(new Item("james9","manager","i.jpg",90, new Date(),1000));
        list.add(new Item("james10","manager","j.jpg",100, new Date(),1000));
        list.add(new Item("james12","manager","k.jpg",10, new Date(),1000));
        list.add(new Item("james12","manager","l.jpg",20, new Date(),2000));
        list.add(new Item("james13","manager","m.jpg",30, new Date(),3000));
        list.add(new Item("james14","manager","n.jpg",40, new Date(),1000));
        list.add(new Item("james15","manager","o.jpg",50, new Date(),1000));
        list.add(new Item("james16","manager","p.jpg",60, new Date(),1000));
        list.add(new Item("james17","manager","q.jpg",70, new Date(),1000));
        list.add(new Item("james18","manager","r.jpg",80, new Date(),1000));
        list.add(new Item("james19","manager","s.jpg",90, new Date(),1000));
        list.add(new Item("james20","manager","t.jpg",100, new Date(),1000));
        model.addAttribute("members", list);
        model.addAttribute("center","tables");
        return "index";
    }

//    List<Item> list = new ArrayList<>();
//        list.add(new Item(100,"pants1",1000,"a.jpg",new Date()));
//        list.add(new Item(101,"pants2",2000,"b.jpg",new Date()));
//        list.add(new Item(102,"pants3",3000,"c.jpg",new Date()));
//        list.add(new Item(103,"pants4",4000,"d.jpg",new Date()));
//        list.add(new Item(104,"pants5",5000,"e.jpg",new Date()));
//
//        model.addAttribute("allitem", list);
//
//        model.addAttribute("left",dir+"left");
//        model.addAttribute("center",dir+"all");
//        return "index";





    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("center","login");
        return "index";
    }

    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("center","register");
        return "index";
    }

    @RequestMapping("/color")
    public String color(Model model){
        model.addAttribute("center","color");
        return "index";
    }
}


