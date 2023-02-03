package org.example.domain.bidirectionalMapping;

import org.example.domain.bidirectionalMapping.model.dto.TeamDto;
import org.example.domain.bidirectionalMapping.model.entity.Team;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Qualifier;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {

    TeamMapper mapper = Mappers.getMapper(TeamMapper.class);

    TeamDto toDtoWithContext(Team entity, @Context CycleAvoidMappingContext context);

    @DoIgnore
    default TeamDto toDto(Team entity){
        return this.toDtoWithContext(entity,new CycleAvoidMappingContext());
    }
}
