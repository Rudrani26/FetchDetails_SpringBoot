package com.example.FetchDetails.Controller;

import com.example.FetchDetails.Entity.PersonalDetails;
import com.example.FetchDetails.Service.FetchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class FetchDetailsController {
    @Autowired
    private FetchDetailsService fetchDetailsService;

    @PostMapping("/save")
    public PersonalDetails savePerson(@RequestBody PersonalDetails personalDetails){
        PersonalDetails person = fetchDetailsService.savePerson(personalDetails);
        return person;
    }

    @GetMapping("/{pd_id}")
    public Optional<PersonalDetails> getDetails(@PathVariable int pd_id){
        Optional<PersonalDetails> details = fetchDetailsService.findById(pd_id);
        return details;
    }
}

