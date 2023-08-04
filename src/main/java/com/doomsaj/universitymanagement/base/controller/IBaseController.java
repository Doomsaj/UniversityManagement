package com.doomsaj.universitymanagement.base.controller;

import com.doomsaj.universitymanagement.base.exception.NotFoundException;
import com.doomsaj.universitymanagement.base.model.dto.BaseDto;
import com.doomsaj.universitymanagement.base.model.entity.BaseEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController<GD extends BaseDto, PD extends BaseDto> {
    ResponseEntity<GD> findBydId(Long id) throws NotFoundException;
    ResponseEntity<List<GD>> findAll();
    ResponseEntity<GD> create(PD dto);
    ResponseEntity<GD> update(PD dto) throws NotFoundException;
    ResponseEntity<Void> deleteById(Long id);
}
