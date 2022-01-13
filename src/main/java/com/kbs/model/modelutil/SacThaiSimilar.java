package com.kbs.model.modelutil;

import com.kbs.model.SacThai;
import lombok.Data;

@Data
public class SacThaiSimilar {
    SacThai sacThai;
    Float similar;

    public SacThaiSimilar(SacThai sacThai, Float similar) {
        this.sacThai = sacThai;
        this.similar = similar;
    }
}
