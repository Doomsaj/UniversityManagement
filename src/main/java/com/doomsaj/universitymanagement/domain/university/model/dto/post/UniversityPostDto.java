package com.doomsaj.universitymanagement.domain.university.model.dto.post;

import com.doomsaj.universitymanagement.base.model.dto.BaseDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UniversityPostDto implements BaseDto {
    private String title;
}
