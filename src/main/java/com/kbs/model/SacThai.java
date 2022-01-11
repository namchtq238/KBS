package com.kbs.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sacthai")
@Data
public class SacThai {
    @Id
    private Integer idsacthai;
    @OneToOne(targetEntity = Cam.class)
    private Cam cam;
    @OneToOne(targetEntity = LongMay.class)
    private LongMay longMay;
    @OneToOne(targetEntity = Ma.class)
    private Ma ma;
    @OneToOne(targetEntity = Mat.class)
    private Mat mat;
    @OneToOne(targetEntity = Moi.class)
    private Moi moi;
    @OneToOne(targetEntity = Mui.class)
    private Mui mui;
    @OneToOne(targetEntity = Rang.class)
    private Rang rang;
    @OneToOne(targetEntity = Tran.class)
    private Tran tran;
    private String mota;
}
