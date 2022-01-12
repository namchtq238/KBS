package com.kbs.service;

import com.kbs.model.SacThaiSimilar;

import java.util.List;

public interface SacThaiService {
    List<SacThaiSimilar> sacThaiSimilar(int icam_id,int ilong_may_id,int ima_id,int imat_id,int imoi_id,int imui_id,int irang_id,int itran_id);
}
