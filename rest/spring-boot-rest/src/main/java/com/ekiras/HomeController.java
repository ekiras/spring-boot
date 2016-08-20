package com.ekiras;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ekiras on 20/08/16.
 */
@RestController
@RequestMapping({"/",""})
public class HomeController {

    @RequestMapping({"","/","/home"})
    public Object home(){
        return "Hello World";
    }

    @RequestMapping("/date")
    public Object date(){
        return new Date().toString();
    }

}
