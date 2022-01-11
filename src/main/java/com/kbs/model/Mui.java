package com.kbs.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Mui {
    @Id
    private Integer id;
    private String mota;
}