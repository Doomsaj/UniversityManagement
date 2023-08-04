package com.doomsaj.universitymanagement.web.university.controller;

import com.doomsaj.universitymanagement.base.controller.BaseRestController;
import com.doomsaj.universitymanagement.base.service.IBaseService;
import com.doomsaj.universitymanagement.domain.university.model.dto.get.UniversityGetDto;
import com.doomsaj.universitymanagement.domain.university.model.dto.post.UniversityPostDto;
import com.doomsaj.universitymanagement.domain.university.model.entity.University;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("university")
public class UniversityController extends BaseRestController<University, UniversityGetDto, UniversityPostDto> {
    public UniversityController(IBaseService<University, UniversityGetDto, UniversityPostDto> baseService) {
        super(baseService);
    }
}
