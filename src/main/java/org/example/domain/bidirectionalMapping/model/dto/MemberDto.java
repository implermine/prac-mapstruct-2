package org.example.domain.bidirectionalMapping.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

    private int id;

    private String name;

    private TeamDto team;
}
