package com.kbs;

import com.kbs.model.*;
import com.kbs.model.modelsimi.TuongDongCam;
import com.kbs.model.modelutil.SacThaiSimilar;
import com.kbs.repo.*;
import com.kbs.repo.tuongdongrepo.TuongDongCamRepo;
import com.kbs.service.SacThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Hashtable;
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
    private SacThaiRepo sacThaiRepo;
    @Autowired
    private TuongDongCamRepo tuongDongCamRepo;
    @Autowired
    private SacThaiService sacThaiService;
    public MainController(SacThaiService sacThaiService){
        this.sacThaiService = sacThaiService;
    }
    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }
    @GetMapping("/input")
    public String getInputPage(Model model){
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
    public String process(@ModelAttribute SacThai sacThai, Model model){
        System.out.println(sacThai.toString());
        List<SacThaiSimilar> sacThaiSimilars = sacThaiService.sacThaiSimilar(sacThai);
        model.addAttribute("listSacThai", sacThaiSimilars);
        System.err.println(sacThaiSimilars.toString());
        return "result";
    };
//    @GetMapping("/test")
//    public String sacThaiSimilar(SacThai sacThai, Model model){
//        sacThai = new SacThai();
//        List<SacThaiSimilar> sacThaiSimilars = sacThaiService.sacThaiSimilar(sacThai);
//        model.addAttribute("listSacThai", sacThaiSimilars);
//        return "result";
//    }
    @GetMapping("/test1")
    public String tinhDoTuongDong(Model model){
        System.err.println("-----------------------------------------------");
        System.err.println();

        float a = sacThaiService.doTuongDongMa(1,2);
        model.addAttribute("a",a);
        System.out.println(a);
        return "result";
    }
}
