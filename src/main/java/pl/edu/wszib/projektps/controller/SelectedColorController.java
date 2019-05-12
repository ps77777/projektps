package pl.edu.wszib.projektps.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.StringUtils;
import pl.edu.wszib.projektps.dao.SelectedColorDao;
import pl.edu.wszib.projektps.domain.SelectedColor;

import java.util.Date;

@Controller
public class SelectedColorController {
    @Value("${app.header.select_color}")
    private String title;
@Autowired
SelectedColorDao selectedColorDao;

    @GetMapping ({"/select","/select/{color}"})
    public String selectColorPage(@PathVariable(required = false) String color, Model model){
       if (!StringUtils.isEmpty(color)){
           selectedColorDao.save(new SelectedColor(color, new Date()));
       }

        String [][] colors={
                {"red", "blue","black","teal"},
                {"black", "orange","yellow","green"},
                {"gray", "silver","olive","lime"},
                {"gray", "silver","olive","lime"}
        };
        model.addAttribute("title", title);
        model.addAttribute("colors", colors);
        return "select";
    }


}
