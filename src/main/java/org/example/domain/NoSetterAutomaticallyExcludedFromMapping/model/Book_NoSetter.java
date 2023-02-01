package org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book_NoSetter {

    private String name;

    @Setter(AccessLevel.NONE)
    private Long isbn;

    // name-modified mutator
    public void changeIsbn(Long isbn){
        this.isbn = isbn;
    }
}
