package org.example.domain.NoSetterAutomaticallyExcludedFromMapping;

import org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model.BookDto_NoSetter;
import org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model.Book_NoSetter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class NoSetterTest {

    private final BookNoSetterMapper mapper = Mappers.getMapper(BookNoSetterMapper.class);

    @Test
    @DisplayName("Setter가 없으면 자동으로 mapping에서 포기하나?")
    void test(){
        BookDto_NoSetter bookDto = new BookDto_NoSetter();
        bookDto.setName("name");
        bookDto.setIsbn(1234L);;

        Book_NoSetter book = mapper.toEntity(bookDto);

        System.out.println(book);
    }
}
