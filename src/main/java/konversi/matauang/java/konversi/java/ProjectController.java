/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.matauang.java.konversi.java;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mladi
 */
public class ProjectController {
    @RequestMapping("/input")
    public String USDtoALL(HttpServletRequest data, Model hasil) {
        
        String inputUSD = data.getParameter("var_usd");
        
        Double iUSD = Double.valueOf(inputUSD);
        
        Double USDtoINR = iUSD * 74.58;
        Double USDtoEUR = iUSD * 0.89;
        Double USDtoSAR = iUSD * 3.75;
        
        
        hasil.addAttribute("inr", USDtoINR);
        hasil.addAttribute("eur", USDtoEUR);
        hasil.addAttribute("sar", USDtoSAR);
        
        return "view";       
       
    }
}
