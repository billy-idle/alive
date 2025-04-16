package com.artemisa.alive.user;

import com.artemisa.alive.base_entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "\"User\"")
@Getter
@Setter
public class User extends BaseEntity {

    @Column(nullable = false)
    private String name;

}
