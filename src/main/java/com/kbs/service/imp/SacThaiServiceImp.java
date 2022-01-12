package com.kbs.service.imp;

import com.kbs.model.SacThai;
import com.kbs.model.SacThaiSimilar;
import com.kbs.repo.SacThaiRepo;
import com.kbs.service.SacThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SacThaiServiceImp implements SacThaiService {
    @Autowired
    private SacThaiRepo sacThaiRepo;

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
}
