package com.tolu.userregistration.Services;


import com.tolu.userregistration.Wrapper.UserWrapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewUserWebService {


    @RequestMapping(method = RequestMethod.POST, value = "/adduser")
    public String addUser(@RequestBody UserWrapper wrapper){
        System.out.println(wrapper);
        return "New user added!";
    }


}
