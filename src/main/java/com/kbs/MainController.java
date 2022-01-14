package com.kbs;

import com.kbs.model.*;
import com.kbs.model.modelutil.SacThaiSimilar;
import com.kbs.repo.*;
import com.kbs.service.SacThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private CamRepo camRepo;
    @Autowired
    private LongMayRepo longMayRepo;
    @Autowired
    private MaRepo maRepo;
    @Autowired
    private MatRepo matRepo;
    @Autowired
    private MoiRepo moiRepo;
    @Autowired
    private MuiRepo muiRepo;
    @Autowired
    private RangRepo rangRepo;
    @Autowired
    private TranRepo tranRepo;
    @Autowired
    private SacThaiService sacThaiService;

    public MainController(SacThaiService sacThaiService) {
        this.sacThaiService = sacThaiService;
    }

    @GetMapping("/")
    public String getLandingPage() {
        return "index";
    }

    @GetMapping("/input")
    public String getInputPage(Model model) {
        List<Cam> camList = camRepo.findAll();
        model.addAttribute("cam", camList);
        List<LongMay> longMayList = longMayRepo.findAll();
        model.addAttribute("longmay", longMayList);
        List<Ma> maList = maRepo.findAll();
        model.addAttribute("ma", maList);
        List<Mat> matList = matRepo.findAll();
        model.addAttribute("mat", matList);
        List<Moi> moiList = moiRepo.findAll();
        model.addAttribute("moi", moiList);
        List<Mui> muiList = muiRepo.findAll();
        model.addAttribute("mui", muiList);
        List<Rang> rangList = rangRepo.findAll();
        model.addAttribute("rang", rangList);
        List<Tran> tranList = tranRepo.findAll();
        model.addAttribute("tran", tranList);
        model.addAttribute("sacthai", new SacThai());
        return "input";
    }

    @PostMapping("/process")
    public String process(@ModelAttribute SacThai sacThai, Model model) {
        System.out.println(sacThai.toString());
        List<SacThaiSimilar> sacThaiSimilars = sacThaiService.sacThaiSimilar(sacThai);
        List<SacThaiSimilar> sacThaiShow = new ArrayList<>();
//        for(int i = 1; i<=5; i++){
//            sacThaiShow.add(sacThaiSimilars.get(i));
//        }
        List<SacThaiSimilar> listTest = new ArrayList<>();
        for (SacThaiSimilar s : sacThaiSimilars) {
            boolean check = false;
            for (SacThaiSimilar similar : listTest) {
                if (s.getSacThai().getMota().trim().equalsIgnoreCase(similar.getSacThai().getMota().trim())) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                listTest.add(s);
            }
        }
        if (listTest.size() < 6) {
            model.addAttribute("listSacThai", listTest);
        } else {
            sacThaiShow = listTest.subList(0, 5);
            model.addAttribute("listSacThai", sacThaiShow);
            SacThaiSimilar sacThaiSimilar = sacThaiSimilars.get(0);
            sacThai.setMota(sacThaiSimilar.getSacThai().getMota());
            boolean check = false;
            if (sacThaiSimilar.getSimilar() < 1) check = sacThaiService.saveSacThai(sacThai);
            model.addAttribute("check", check);
            model.addAttribute("sacThaiOutput", sacThaiSimilar);
        }
        model.addAttribute("sacThaiInput", sacThai);
        System.err.println(listTest.size());
        for(SacThaiSimilar i : listTest) {
            System.err.println(i.getSacThai().getIdsacthai()+"    -----   "+i.getSacThai().getMota());
        }
        return "result";
    }

    ;

}
