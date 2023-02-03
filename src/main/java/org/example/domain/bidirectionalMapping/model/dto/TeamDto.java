package org.example.domain.bidirectionalMapping.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TeamDto {

    private int id;

    private String name;

    private final List<MemberDto> members = new ArrayList<>();
}
