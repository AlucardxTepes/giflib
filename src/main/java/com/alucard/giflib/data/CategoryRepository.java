package com.alucard.giflib.data;

import com.alucard.giflib.model.Category;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alucard on 25-Apr-17.
 */
@Component
public class CategoryRepository {

  private static List<Category> ALL_CATEGORIES = Arrays.asList(
          new Category(1, "Category1"),
          new Category(2, "Category2"),
          new Category(3, "Category3")
  );

  public List<Category> getAllCategories() {
    return ALL_CATEGORIES;
  }

  public Category findById(int id) {
    for (Category c : ALL_CATEGORIES){
      if (c.getId() == id) {
        return c;
      }
    }
    return null;
  }
}
