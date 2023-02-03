package org.example.domain.bidirectionalMapping;

import org.example.domain.bidirectionalMapping.model.dto.MemberDto;
import org.example.domain.bidirectionalMapping.model.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper {

    MemberMapper mapper = Mappers.getMapper(MemberMapper.class);


    MemberDto toDto(Member entity);
}
