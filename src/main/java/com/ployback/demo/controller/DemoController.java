package com.ployback.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ployback.demo.bean.Persona;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Persona obtenerPerson(HttpServletRequest servletRequest) {

    	Persona user = new Persona();
        user.setVotos("100");
        user.setNombre("Movimiento Naranja");
        user.setMesa("Chimal");

        return user;
    }
}
