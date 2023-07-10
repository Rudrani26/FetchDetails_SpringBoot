package com.example.FetchDetails.Service;

import com.example.FetchDetails.Entity.BankDetails;
import com.example.FetchDetails.Entity.EmploymentDetails;
import com.example.FetchDetails.Entity.PersonalDetails;
import com.example.FetchDetails.Repository.PersonalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FetchDetailsServiceImpl implements FetchDetailsService {

    @Autowired
    private PersonalDetailsRepository personalDetailsRepository;

    @Override
    public PersonalDetails savePerson(PersonalDetails personalDetails) {
        BankDetails bankDetails = personalDetails.getBankDetails();
        EmploymentDetails employmentDetails = personalDetails.getEmploymentDetails();
        PersonalDetails details = personalDetailsRepository.save(personalDetails);
        return details;
    }

    @Override
    public Optional<PersonalDetails> findById(int pd_id) {
        Optional<PersonalDetails> personalDetails = personalDetailsRepository.findById(pd_id);
        return personalDetails;
    }

}