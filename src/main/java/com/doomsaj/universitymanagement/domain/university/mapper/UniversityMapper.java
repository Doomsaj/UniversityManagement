package com.doomsaj.universitymanagement.domain.university.mapper;

import com.doomsaj.universitymanagement.base.mapper.IBaseMapper;
import com.doomsaj.universitymanagement.domain.university.model.dto.get.UniversityGetDto;
import com.doomsaj.universitymanagement.domain.university.model.dto.post.UniversityPostDto;
import com.doomsaj.universitymanagement.domain.university.model.entity.University;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring",uses = UniversityMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UniversityMapper extends IBaseMapper<University, UniversityGetDto, UniversityPostDto> {
}
