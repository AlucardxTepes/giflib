package com.alucard.giflib.controller;

import com.alucard.giflib.data.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alucard on 4/25/2017.
 */
@Controller
public class CategoryController {

  @Autowired
  private CategoryRepository categoryRepository;

  @RequestMapping("/categories")
  public String categories(ModelMap m) {
    m.put("categories", categoryRepository.getAllCategories());
    return "categories";
  }
}
