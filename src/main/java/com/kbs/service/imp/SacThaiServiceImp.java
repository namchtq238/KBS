package com.kbs.service.imp;

import com.kbs.model.SacThai;
import com.kbs.model.modelsimi.*;
import com.kbs.model.modelutil.SacThaiSimilar;
import com.kbs.repo.SacThaiRepo;
import com.kbs.repo.tuongdongrepo.*;
import com.kbs.service.SacThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SacThaiServiceImp implements SacThaiService {
    @Autowired
    private SacThaiRepo sacThaiRepo;
    @Autowired
    private TuongDongCamRepo tuongDongCamRepo;
    @Autowired
    private TuongDongLongMayRepo tuongDongLongMayRepo;
    @Autowired
    private TuongDongMaRepo tuongDongMaRepo;
    @Autowired
    private TuongDongMatRepo tuongDongMatRepo;
    @Autowired
    private TuongDongMoiRepo tuongDongMoiRepo;
    @Autowired
    private TuongDongMuiRepo tuongDongMuiRepo;
    @Autowired
    private TuongDongRangRepo tuongDongRangRepo;
    @Autowired
    private TuongDongTranRepo tuongDongTranRepo;
    public SacThaiServiceImp(SacThaiRepo sacThaiRepo,TuongDongCamRepo tuongDongCamRepo){
        this.sacThaiRepo = sacThaiRepo;
        this.tuongDongCamRepo = tuongDongCamRepo;
    }
    @Override
    public List<SacThaiSimilar> sacThaiSimilar(int icam_id, int ilong_may_id, int ima_id, int imat_id, int imoi_id, int imui_id, int irang_id, int itran_id) {
        List<SacThai> listSacThai = sacThaiRepo.findAll();
        List<SacThaiSimilar> listSacThaiSimilars = new ArrayList<>();
        for(SacThai sacThai:listSacThai){
            SacThaiSimilar sacThaiSimilar = new SacThaiSimilar();
            sacThaiSimilar.setSacThai(sacThai);
            sacThaiSimilar.setSimilar(sacThaiRepo.sacThaiSimilar(icam_id,ilong_may_id,ima_id,imat_id,imoi_id,imui_id,irang_id,itran_id).get(0));
            listSacThaiSimilars.add(sacThaiSimilar);
        }
        return listSacThaiSimilars;
    }

    @Override
    public List<Float> tinhDoTuongDong(int cam_id,int long_may_id,int ma_id,int mat_id,int moi_id,int mui_id,int rang_id,int tran_id) {
        Hashtable<Integer, Optional<TuongDongCam>> caseProblemCam = new Hashtable<>();
        System.err.println(caseProblemCam);
        Set<Integer> keySet = caseProblemCam.keySet();
        float tong = 0;
        List<Float> tuongDongCam = new ArrayList<>();
        for(Integer key : keySet){
            for(TuongDongCam i : tuongDongCamRepo.findAll()){
                tuongDongCam.add(i.getGiaTri() * key);
            }
        }
        System.err.println(tuongDongCam);
        return tuongDongCam;
    }

    @Override
    public boolean saveSacThai(SacThai sacThai) {
        sacThaiRepo.save(sacThai);
        return true;
    }
}
