package com.kbs;

import com.kbs.model.*;
import com.kbs.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String process(){
        return "result";
    };
}
