package com.kbs.service.imp;
import com.kbs.model.SacThai;
import com.kbs.model.modelsimi.TuongDongCam;
import com.kbs.model.modelutil.SacThaiSimilar;
import com.kbs.repo.CamRepo;
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
    private CamRepo camRepo;
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
    public List<SacThaiSimilar> sacThaiSimilar() {
        List<SacThai> listSacThai = sacThaiRepo.findAll();
        List<SacThaiSimilar> listSacThaiSimilars = new ArrayList<>();
        for(SacThai sacThai:listSacThai){
            SacThaiSimilar sacThaiSimilar = new SacThaiSimilar();
            sacThaiSimilar.setSacThai(sacThai);
            sacThaiSimilar.setSimilar(sacThaiRepo.sacThaiSimilar().get(0));
            listSacThaiSimilars.add(sacThaiSimilar);
        }
        return listSacThaiSimilars;
    }

    @Override
    public List<Float> tinhDoTuongDong(int cam_id) {
        Hashtable<Integer,Float> cam = new Hashtable<>();
        cam.put(camRepo.getById(cam_id).getTrongSo(), tuongDongCamRepo.getById(cam_id).getGiaTri());
        Set<Integer> keys = cam.keySet();
        float tong = 0;
        List<Float> tuongDongCam = new ArrayList<>();
        for(Integer key : keys){
            for(TuongDongCam i : tuongDongCamRepo.findAll()){
            tong += tuongDongCamRepo.getById(cam_id).getGiaTri()*key;
            tuongDongCam.add(tong);
            }
        }
        return tuongDongCam;
    }

    @Override
    public boolean saveSacThai(SacThai sacThai) {
        sacThaiRepo.save(sacThai);
        return true;
    }
}
