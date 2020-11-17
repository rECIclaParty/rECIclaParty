package edu.eci.arsw.reciclaparty.controller;

import edu.eci.arsw.reciclaparty.services.UserServices;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Autowired
    private UserServices customerService;

    @PostMapping("/token")
    public String getToken(@RequestParam("correo") final String correo, @RequestParam("password") final String password){
        String token= customerService.login(correo,password);
        if(StringUtils.isEmpty(token)){
            return "no token found";
        }
        return token;
    }
}