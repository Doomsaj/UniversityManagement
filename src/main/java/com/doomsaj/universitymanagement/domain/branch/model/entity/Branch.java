package com.doomsaj.universitymanagement.domain.branch.model.entity;

import com.doomsaj.universitymanagement.base.model.entity.BaseEntity;
import com.doomsaj.universitymanagement.domain.university.model.entity.University;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Branch extends BaseEntity {
    private String title;
    @ManyToOne
    @JoinColumn(name = "uni_id")
    private University university;
}
