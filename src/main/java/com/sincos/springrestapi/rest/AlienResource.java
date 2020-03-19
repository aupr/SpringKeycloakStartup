package com.sincos.springrestapi.rest;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@CrossOrigin
//@CrossOrigin(origins = "*")
public class AlienResource {

    @RequestMapping("aliens/kk")
    public String getAliens() {
        return "Hello Aliens";
    }

    @GetMapping("item/{name}/{item_type}")
    public Map<String, String> getuuu(@PathVariable("name") String myName,@PathVariable("item_type") String myItemType) {
        //Do your business with your name and item_type path Variable

        //return myName+"/"+myItemType;

            HashMap<String, String> map = new HashMap<>();
            map.put(myName, myItemType);
            map.put("foo", "bar");
            map.put("aa", "bb");
            return map;

    }

    //@CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("item2/{name}/{item_type}")
    public String getyyyy(@PathVariable Map<String,String> pathVars){
        //try something like
        String name= pathVars.get("name");
        String type= pathVars.get("item_type");
        //Do your business with your name and item_type path Variable
        return name+"/"+type;
    }
}
