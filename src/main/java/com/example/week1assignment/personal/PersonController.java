package com.example.week1assignment.personal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPersonInfo(){
        Person person = new Person();
        person.setAge(6);
        person.setJob("camper");
        person.setName("ye");
        return person;
    }

}
