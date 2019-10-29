package com.codeinvestigator.springbootthymeleaf.spaceship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//knfekdf
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer crew;
}
