package ru.semenov.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.semenov.springcourse.dao.PersonDAO;
import ru.semenov.springcourse.models.Person;

import java.security.Permission;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model){

        model.addAttribute("people", personDAO.index());

        return "/people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {

        model.addAttribute("person", personDAO.show(id));

        return "/people/show";
    }

    @GetMapping("/new")
    public String newPerson (@ModelAttribute("person") Person person) {
        return "/people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDAO.save(person);

        return "redirect:/people";
    }

    // Возвращает страницу с формой для редактирования пользователя
    @GetMapping("/{id}/edit")
    public String edit(Model model ,@PathVariable("id") int id) {
        model.addAttribute("person", personDAO.show(id));

        return "/people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Person person, @PathVariable("id") int id) {
        personDAO.update(person, id);

        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {

        personDAO.delete(id);

        return "redirect:/people";
    }

}
