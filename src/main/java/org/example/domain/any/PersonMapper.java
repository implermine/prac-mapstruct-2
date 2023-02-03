package org.example.domain.any;

import org.example.domain.any.model.Person;
import org.example.domain.any.model.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(target = "personDetailAliasName" , source = "personDetail.aliasName")
    PersonDto toDto(Person entity);
}
