package com.kbs.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sacthai")
@Data
public class SacThai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsacthai;
    @ManyToOne(targetEntity = Cam.class)
    @JoinColumn(name = "idcam")
    private Cam cam;
    @ManyToOne(targetEntity = LongMay.class)
    @JoinColumn(name = "idlongmay")
    private LongMay longMay;
    @ManyToOne(targetEntity = Ma.class)
    @JoinColumn(name = "idma")
    private Ma ma;
    @ManyToOne(targetEntity = Mat.class)
    @JoinColumn(name = "idmat")
    private Mat mat;
    @ManyToOne(targetEntity = Moi.class)
    @JoinColumn(name = "idmoi")
    private Moi moi;
    @ManyToOne(targetEntity = Mui.class)
    @JoinColumn(name = "idmui")
    private Mui mui;
    @ManyToOne(targetEntity = Rang.class)
    @JoinColumn(name = "idrang")
    private Rang rang;
    @ManyToOne(targetEntity = Tran.class)
    @JoinColumn(name = "idtran")
    private Tran tran;
    private String mota;
}
