package com.echo.controller;

import com.echo.pojo.FreshData;
import com.echo.service.FreshDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private FreshDataService freshDataService;

    @RequestMapping({"/","/index","index.html"})
    public String index(Model model){
        List<FreshData> allFreshData = freshDataService.findAllFreshData();
        model.addAttribute("freshData",allFreshData);
        return "index_football";
    }

    @RequestMapping("/api/fresh")
    @ResponseBody
    public List<FreshData> getAllFreshDataApi(){
        return freshDataService.findAllFreshData();
    }
}
