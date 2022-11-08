package com.miori.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Entity
public class Member {
    @Id
    private String id;
    private String password;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private boolean enabled;
}
