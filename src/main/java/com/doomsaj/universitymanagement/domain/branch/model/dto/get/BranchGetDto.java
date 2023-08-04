package com.doomsaj.universitymanagement.domain.branch.model.dto.get;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class BranchGetDto implements Serializable {
    private Long id;
}
