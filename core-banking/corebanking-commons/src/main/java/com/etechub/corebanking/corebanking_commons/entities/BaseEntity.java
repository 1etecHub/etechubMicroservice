package com.etechub.corebanking.corebanking_commons.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @SequenceGenerator(name = "id",
            sequenceName = "id", allocationSize = 1)
    @GeneratedValue(generator = "id",
            strategy = GenerationType.SEQUENCE)
    private Long id;
}
