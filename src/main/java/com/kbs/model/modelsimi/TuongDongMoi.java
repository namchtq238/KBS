package com.kbs.model.modelsimi;
import com.kbs.model.Moi;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tuong_dong_moi")
public class TuongDongMoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tuong_dong")
    private Integer idTuongDong;
    @Column(name = "thuoc_tinh_vao")
    private Integer thuocTinhVao;
    @ManyToOne(targetEntity = Moi.class)
    @JoinColumn(name = "thuoc_tinh_co_san")
    private Integer thuocTinhCoSan;
    @Column(name = "gia_tri")
    private Float giaTri;
}
