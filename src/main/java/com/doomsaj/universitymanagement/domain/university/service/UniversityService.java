package com.doomsaj.universitymanagement.domain.university.service;

import com.doomsaj.universitymanagement.base.mapper.IBaseMapper;
import com.doomsaj.universitymanagement.base.repository.IBaseRepository;
import com.doomsaj.universitymanagement.base.service.BaseService;
import com.doomsaj.universitymanagement.base.service.IBaseService;
import com.doomsaj.universitymanagement.domain.university.mapper.UniversityMapper;
import com.doomsaj.universitymanagement.domain.university.model.dto.get.UniversityGetDto;
import com.doomsaj.universitymanagement.domain.university.model.dto.post.UniversityPostDto;
import com.doomsaj.universitymanagement.domain.university.model.entity.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService extends BaseService<University, UniversityGetDto, UniversityPostDto> implements IUniversityService {
    @Autowired
    public UniversityService(IBaseRepository<University> baseRepository, UniversityMapper mapper) {
        super(baseRepository, mapper);
    }
}
