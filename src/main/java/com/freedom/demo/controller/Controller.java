package com.freedom.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/16 15:34
 */

@Slf4j
@RestController
@RequestMapping("/custom/open/workflow")
public class Controller {

    @RequestMapping(value = "/callback",method = RequestMethod.POST)
    public void callback() {
        System.out.println("111");
    }

}
