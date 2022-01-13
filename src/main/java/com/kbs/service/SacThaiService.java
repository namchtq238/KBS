package com.kbs.service;

import com.kbs.model.SacThai;
import com.kbs.model.modelsimi.TuongDongCam;
import com.kbs.model.modelutil.SacThaiSimilar;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public interface SacThaiService {
    List<SacThaiSimilar> sacThaiSimilar(int icam_id,int ilong_may_id,int ima_id,int imat_id,int imoi_id,int imui_id,int irang_id,int itran_id);
    List<Float> tinhDoTuongDong(int cam_id,int long_may_id,int ma_id,int mat_id,int moi_id,int mui_id,int rang_id,int tran_id);
    boolean saveSacThai(SacThai sacThai);
}
