package org.example.domain.any.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonDto {

    private String name;
    private int height;
    private String personDetailAliasName;

    private List<String> talents;

}
