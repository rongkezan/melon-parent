package com.melon.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keith
 */
@RestController
public class CheckController {

    @GetMapping("check")
    public String check(){
        return "Connect Successful";
    }
}
