package com.alucard.giflib.controller;

import com.alucard.giflib.data.CategoryRepository;
import com.alucard.giflib.data.GifRepository;
import com.alucard.giflib.model.Gif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Alucard on 4/25/2017.
 */
@Controller
public class CategoryController {

  @Autowired private CategoryRepository categoryRepository;
  @Autowired private GifRepository gifRepository;

  @RequestMapping("/categories")
  public String categories(ModelMap m) {
    m.put("categories", categoryRepository.getAllCategories());
    return "categories";
  }

  @RequestMapping("/category/{id}")
  public String categoryList(@PathVariable int id, ModelMap m) {
    List<Gif> gifs = gifRepository.getByCategory(id);
    m.put("gifs", gifs);
    m.put("category", categoryRepository.findById(id));
    return "category";
  }
}
