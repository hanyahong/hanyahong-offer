/*    */
package com.hanyahong.api;

import com.hanyahong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = {"/user"}, produces = {"application/json"})
public class UserApi {


    @Autowired
    UserService service;

    @RequestMapping(value = {"/server"}, method = {RequestMethod.POST})
    public Info locationPost(@org.springframework.web.bind.annotation.RequestParam("url") String url) {
        return this.service.send(url);
    }

}

