package com.doomsaj.universitymanagement.base.service;

import com.doomsaj.universitymanagement.base.exception.NotFoundException;
import com.doomsaj.universitymanagement.base.model.dto.BaseDto;
import com.doomsaj.universitymanagement.base.model.entity.BaseEntity;

import java.util.List;

public interface IBaseService<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> {
    GD findById(Long id) throws NotFoundException;

    List<GD> findAll();

    GD create(PD dto);

    GD update(Long id, PD dto) throws NotFoundException;

    void deleteById(Long id);
}
