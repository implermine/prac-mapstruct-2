package org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookDto_NoSetter {

    private String name;

    private Long isbn;
}
