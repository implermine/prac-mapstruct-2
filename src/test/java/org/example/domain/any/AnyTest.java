package org.example.domain.any;

import org.example.domain.any.model.Person;
import org.example.domain.any.model.PersonDetail;
import org.example.domain.any.model.PersonDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class AnyTest {

    private PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

    @Test
    @DisplayName("1 detph value를 0 depth로 꺼내기")
    void test(){
        Person person = new Person();
        person.setName("이태강");
        person.setHeight(180);

        PersonDetail personDetail = new PersonDetail();
        personDetail.setAliasName("이이이");

        person.setPersonDetail(personDetail);

        PersonDto personDto = mapper.toDto(person);

        System.out.println(personDto);

    }

}
