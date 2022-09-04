package org.example.main;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Parrot {
    private String name = "Coco";
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }
}
