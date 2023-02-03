package org.example.domain.bidirectionalMapping.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Team {

    private int id;

    private String name;

    private final List<Member> members = new ArrayList<>();
}
