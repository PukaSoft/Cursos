package com.pukasoft.springdata.web;


import com.pukasoft.springdata.dao.PersonaDao;
import com.pukasoft.springdata.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CotroladorIndex {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        Iterable<Persona> personas = personaDao.findAll();
        model.addAttribute("personas",personas);
        return "index";
    }

}
