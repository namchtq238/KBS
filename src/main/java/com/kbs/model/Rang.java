package com.kbs.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mota;
    private Integer trongSo = 3;
}
