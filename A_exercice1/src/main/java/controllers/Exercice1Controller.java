package controllers;

import dto.EmployeDTO;
import entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import services.Facade;

import java.util.List;

@Controller
@SessionAttributes("idEmp")
@RequestMapping("/")
public class Exercice1Controller {
    @Autowired
    Facade facade;

    @RequestMapping("")
    public String hello(Model model) {
        model.addAttribute("employe",new Employe());
        return("hello");
    }

    @RequestMapping ("listesdto")
    public String dto(Employe employe,Model model) {
        model.addAttribute("listesdto",facade.retrieveEmploye(employe.getIdEmp()));
        return "listesdto";
    }

}
