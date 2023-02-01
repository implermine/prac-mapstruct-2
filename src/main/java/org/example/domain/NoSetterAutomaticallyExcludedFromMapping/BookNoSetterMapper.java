package org.example.domain.NoSetterAutomaticallyExcludedFromMapping;

import org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model.BookDto_NoSetter;
import org.example.domain.NoSetterAutomaticallyExcludedFromMapping.model.Book_NoSetter;
import org.mapstruct.Mapper;

@Mapper
public interface BookNoSetterMapper {

    Book_NoSetter toEntity(BookDto_NoSetter dto);
}
