package com.example.demo.Entity.common_entities;

import com.example.demo.Entity.FollowUp.followUpData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class ICD10_mapping {
    @Id
    private String icd10;

    @Column(nullable = false)
    private String disease;
    @OneToMany(mappedBy = "icd10")
    private List<followUpData> followupdata;
}
