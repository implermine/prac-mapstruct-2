package org.example.domain.any.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {

    private String name;
    private int height;

    private PersonDetail personDetail;

}
