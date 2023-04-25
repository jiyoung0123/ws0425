package com.kbstar.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONArray;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Chart01Controller {

    @RequestMapping("/chart01")
    public Object chart(Model model){
        JSONArray ja = new JSONArray();
        for(int i=1; i<=12; i++){
            Random r = new Random();
            int cnt = r.nextInt(1000)+1;
            ja.add(cnt);
        }
        return ja;
    }

    @RequestMapping ("/chart02")
    public Object chart02(Model model){
        JSONArray ja = new JSONArray();
        for(int i=1; i<=9; i++){
            Random r = new Random();
            int num = r.nextInt(10)+1;
            JSONArray jadata = new JSONArray();
            jadata.add("도넛차트"+num);
            jadata.add(num);
            ja.add(jadata);
        }
        return ja;
    }

}
