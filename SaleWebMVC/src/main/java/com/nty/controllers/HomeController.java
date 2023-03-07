/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nty.controllers;

import com.nty.pojo.Category;
import com.nty.pojo.Product;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        List<Category> cates = new ArrayList<>();
        cates.add(new Category(1, "Mobile"));
        cates.add(new Category(1, "tablet"));
        cates.add(new Category(1, "Desktop"));
        
        
        List<Product> pros = new ArrayList<>();
        pros.add(new Product(1, "Ipad pro", "hhttps://24hstore.vn/samsung-galaxy-a/samsung-galaxy-a23-5g-p6802?gclid=EAIaIQobChMIhvSLyuXB_QIVCdxMAh0Prg1KEAQYBSABEgLLbPD_BwE#lg=1&slide=1", 1200000l));
        pros.add(new Product(2, "Samsung galaxy", "https://24hstore.vn/samsung-galaxy-a/samsung-galaxy-a23-5g-p6802?gclid=EAIaIQobChMIhvSLyuXB_QIVCdxMAh0Prg1KEAQYBSABEgLLbPD_BwE#lg=1&slide=1", 2400000l));
        pros.add(new Product(3, "Iphone pro 11", "https://24hstore.vn/samsung-galaxy-a/samsung-galaxy-a23-5g-p6802?gclid=EAIaIQobChMIhvSLyuXB_QIVCdxMAh0Prg1KEAQYBSABEgLLbPD_BwE#lg=1&slide=1", 2600000l));
        pros.add(new Product(4, "Xiaomi", "https://24hstore.vn/samsung-galaxy-a/samsung-galaxy-a23-5g-p6802?gclid=EAIaIQobChMIhvSLyuXB_QIVCdxMAh0Prg1KEAQYBSABEgLLbPD_BwE#lg=1&slide=1", 3000000l));

        model.addAttribute("catogories", cates);
        model.addAttribute("products", pros);
        return "index";
    }
}
