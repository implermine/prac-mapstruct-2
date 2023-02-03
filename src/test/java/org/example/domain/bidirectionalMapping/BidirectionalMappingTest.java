package org.example.domain.bidirectionalMapping;

import org.example.domain.bidirectionalMapping.model.dto.TeamDto;
import org.example.domain.bidirectionalMapping.model.entity.Member;
import org.example.domain.bidirectionalMapping.model.entity.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;

/**
 * Should Test via Debugger NOT console out due to Circular References
 */
public class BidirectionalMappingTest {

    private final TeamMapper teamMapper = TeamMapper.mapper;
    private final MemberMapper memberMapper = MemberMapper.mapper;

    private Team teamA;
    private Member member1;
    private Member member2;


    @BeforeEach
    @DisplayName("scenario")
    void scenario(){
        Team teamA = new Team();
        teamA.setId(1);
        teamA.setName("teamA");

        Member member1 = new Member();
        member1.setId(1);
        member1.setName("member1");

        Member member2 = new Member();
        member1.setId(2);
        member1.setName("member2");

        member1.setTeam(teamA);
        member2.setTeam(teamA);

        teamA.getMembers().add(member1);
        teamA.getMembers().add(member2);

        this.teamA = teamA;
        this.member1 = member1;
        this.member2 = member2;
    }

    @Test
    @DisplayName("Team (has N)")
    void test(){
        TeamDto teamDto = teamMapper.toDto(teamA);

        System.out.println("hey");
    }
}
