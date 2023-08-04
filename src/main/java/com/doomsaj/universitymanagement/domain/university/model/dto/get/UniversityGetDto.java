package com.doomsaj.universitymanagement.domain.university.model.dto.get;

import com.doomsaj.universitymanagement.base.model.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UniversityGetDto implements BaseDto {
    private String title;
}
