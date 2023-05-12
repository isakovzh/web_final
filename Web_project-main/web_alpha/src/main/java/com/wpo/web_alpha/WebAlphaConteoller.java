package com.wpo.web_alpha;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebAlphaConteoller {
    WebAlphaService webAlphaService = new WebAlphaService();


    @GetMapping("/")
    public String getIndex(Model model ){
       model.addAttribute("item", new Item());
       return "index";
    }
    @PostMapping("/submitItem")
    public String handlesubmit(@Valid Item item,BindingResult result){
        if (result.hasErrors()) return "index";
        webAlphaService.addItem(item);
        
        return "redirect:/vds";

    }

    @GetMapping("/vds")
    public String getVsd(Model model){
        model.addAttribute("items", webAlphaService.getItems());
        return "vds";
    }


}
