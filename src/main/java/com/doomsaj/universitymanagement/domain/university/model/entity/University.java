package com.doomsaj.universitymanagement.domain.university.model.entity;

import com.doomsaj.universitymanagement.base.model.entity.BaseEntity;
import com.doomsaj.universitymanagement.domain.branch.model.entity.Branch;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class University extends BaseEntity {
    private String title;
    @OneToMany(mappedBy = "university")
    private Set<Branch> branches;
}
