package com.doomsaj.universitymanagement.domain.university.service;

import com.doomsaj.universitymanagement.base.service.IBaseService;
import com.doomsaj.universitymanagement.domain.university.model.dto.get.UniversityGetDto;
import com.doomsaj.universitymanagement.domain.university.model.dto.post.UniversityPostDto;
import com.doomsaj.universitymanagement.domain.university.model.entity.University;

public interface IUniversityService extends IBaseService<University, UniversityGetDto, UniversityPostDto> {
}
