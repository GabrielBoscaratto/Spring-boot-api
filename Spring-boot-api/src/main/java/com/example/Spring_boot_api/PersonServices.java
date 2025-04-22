package com.example.Spring_boot_api;

import com.example.Spring_boot_api.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service

public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    ;

    public Person findById(String id) {
        logger.info("Finding person by id: " );

        Person person = new Person();
        Person.setId(counter.incrementAndGet());
        Person.setFirstName("John");
        Person.setLastName("Doe");
        Person.setAddress("123 Main St");
        return person;
    }
}
