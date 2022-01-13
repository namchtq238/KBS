package com.kbs.service;

import com.kbs.model.SacThai;
import com.kbs.model.modelutil.SacThaiSimilar;
import java.util.List;

public interface SacThaiService {
    List<SacThaiSimilar> sacThaiSimilar(SacThai sacThaiInput);
    SacThaiSimilar tinhDoTuongDong(SacThai sacThaiDb, SacThai sacThaiInput);
    Float doTuongDongCam(int idDb, int idInput);
    Float doTuongDongLongMay(int idDb, int idInput);
    Float doTuongDongMa(int idDb, int idInput);
    Float doTuongDongMat(int idDb, int idInput);
    Float doTuongDongMoi(int idDb, int idInput);
    Float doTuongDongMui(int idDb, int idInput);
    Float doTuongDongRang(int idDb, int idInput);
    Float doTuongDongTran(int idDb, int idInput);
    boolean saveSacThai(SacThai sacThai);
}
