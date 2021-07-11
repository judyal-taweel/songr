package com.friendship.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HelloController {
    @GetMapping("/Hello")
    String hello(){
        System.out.println("my page");
        return "HelloPage";
    }

    @GetMapping("/capitalize/hello")
    String capitalize(@RequestParam(name="name",required = false,defaultValue = "this is kinda capitalize") String name, Model model){
        System.out.println("the capital is "+ name);
        model.addAttribute("name",name);
        return "capitalize";
    }
    @ResponseBody
    @GetMapping("/Album")
    ArrayList album(){
        ArrayList albums= new ArrayList();
        Album album1= new Album("ziad burji","Ziad burji",6,"4:30","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
        Album album2= new Album("rubi","Rubi",4,"2:50","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.mJ4hrNKMi7lHaXdcbkVwiAHaHa%26pid%3DApi&f=1");
        Album album3= new Album("sun rise","jjjj",5,"3:15","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.BIlkqO504KYHLj__I7ufQgHaHa%26pid%3DApi&f=1");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        return albums;
        }

}
