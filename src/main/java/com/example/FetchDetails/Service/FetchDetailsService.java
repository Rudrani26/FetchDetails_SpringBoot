package com.example.FetchDetails.Service;

import com.example.FetchDetails.Entity.PersonalDetails;

import java.util.Optional;

public interface FetchDetailsService {

   PersonalDetails savePerson(PersonalDetails personalDetails);

   Optional<PersonalDetails> findById(int pd_id);

}
