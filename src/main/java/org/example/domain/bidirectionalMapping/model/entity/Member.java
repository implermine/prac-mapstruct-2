package org.example.domain.bidirectionalMapping.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Member {

    private int id;

    private String name;

    private Team team;
}
