package com.doomsaj.universitymanagement.base.mapper;

import com.doomsaj.universitymanagement.base.model.dto.BaseDto;
import com.doomsaj.universitymanagement.base.model.entity.BaseEntity;
public interface IBaseMapper<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> {
    GD entityToGetDto(T entity);
    T postDtoToEntity(PD dto);
}
