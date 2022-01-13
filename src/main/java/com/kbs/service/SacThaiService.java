package com.kbs.service;

import com.kbs.model.SacThai;
import com.kbs.model.modelsimi.TuongDongCam;
import com.kbs.model.modelutil.SacThaiSimilar;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public interface SacThaiService {
    List<SacThaiSimilar> sacThaiSimilar();
    List<Float> tinhDoTuongDong(int cam_id);
    boolean saveSacThai(SacThai sacThai);
}
