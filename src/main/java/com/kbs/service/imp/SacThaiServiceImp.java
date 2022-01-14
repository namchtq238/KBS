package com.kbs.service.imp;

import com.kbs.model.SacThai;
import com.kbs.model.modelutil.SacThaiSimilar;
import com.kbs.repo.CamRepo;
import com.kbs.repo.SacThaiRepo;
import com.kbs.repo.tuongdongrepo.*;
import com.kbs.service.SacThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public List<SacThaiSimilar> sacThaiSimilar(SacThai sacThaiInput) {
        List<SacThai> sacThaiList = sacThaiRepo.findAll();
        List<SacThaiSimilar> sacThaiSimilars = new ArrayList<>();
        for(SacThai s:sacThaiList){
            sacThaiSimilars.add(tinhDoTuongDong(s,sacThaiInput));
        }
        Collections.sort(sacThaiSimilars, (c1, c2) ->
        {
            return c1.getSimilar() >= c2.getSimilar() ? -1 : 1;
        });
        //sacThaiSimilars.stream().sorted(Comparator.comparingDouble(SacThaiSimilar::getSimilar).reversed()).collect(Collectors.toList());
        return sacThaiSimilars;
    }

    @Override
    public SacThaiSimilar tinhDoTuongDong(SacThai sacThaiDb, SacThai sacThaiInput) {
        float tong = 0;
        tong += sacThaiDb.getCam().getTrongSo()*doTuongDongCam(sacThaiDb.getCam().getId(),sacThaiInput.getCam().getId());
        tong += sacThaiDb.getLongMay().getTrongSo()*doTuongDongLongMay(sacThaiDb.getLongMay().getId(),sacThaiInput.getLongMay().getId());
        tong += sacThaiDb.getMa().getTrongSo()*doTuongDongMa(sacThaiDb.getMa().getId(),sacThaiInput.getMa().getId());
        tong += sacThaiDb.getMat().getTrongSo()*doTuongDongMat(sacThaiDb.getMat().getId(),sacThaiInput.getMat().getId());
        tong += sacThaiDb.getMoi().getTrongSo()*doTuongDongMoi(sacThaiDb.getMoi().getId(),sacThaiInput.getMoi().getId());
        tong += sacThaiDb.getMui().getTrongSo()*doTuongDongMui(sacThaiDb.getMui().getId(),sacThaiInput.getMui().getId());
        tong += sacThaiDb.getRang().getTrongSo()*doTuongDongRang(sacThaiDb.getRang().getId(),sacThaiInput.getRang().getId());
        tong += sacThaiDb.getTran().getTrongSo()*doTuongDongTran(sacThaiDb.getTran().getId(),sacThaiInput.getTran().getId());
        int tongTrongSo = 0;
        tongTrongSo = sacThaiDb.getCam().getTrongSo()+sacThaiDb.getLongMay().getTrongSo()+
                sacThaiDb.getMa().getTrongSo()+sacThaiDb.getMat().getTrongSo()+sacThaiDb.getMoi().getTrongSo()
                +sacThaiDb.getMui().getTrongSo()+sacThaiDb.getRang().getTrongSo()+sacThaiDb.getTran().getTrongSo();
        return new SacThaiSimilar(sacThaiDb, tong/tongTrongSo);
    }

    @Override
    public Float doTuongDongCam(int idDb, int idInput) {
        return tuongDongCamRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongLongMay(int idDb, int idInput) {
        return tuongDongLongMayRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongMa(int idDb, int idInput) {
        return tuongDongMaRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongMat(int idDb, int idInput) {
        return tuongDongMatRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongMoi(int idDb, int idInput) {
        return tuongDongMoiRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongMui(int idDb, int idInput) {
        return tuongDongMuiRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongRang(int idDb, int idInput) {
        return tuongDongRangRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public Float doTuongDongTran(int idDb, int idInput) {
        return tuongDongTranRepo.getGiaTri(idDb, idInput);
    }

    @Override
    public boolean saveSacThai(SacThai sacThai) {
        sacThaiRepo.save(sacThai);
        return true;
    }
}
