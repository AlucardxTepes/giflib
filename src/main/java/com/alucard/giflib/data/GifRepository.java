package com.alucard.giflib.data;

import com.alucard.giflib.model.Gif;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alucard on 25-Apr-17.
 */
@Repository
public class GifRepository {
  private static final List<Gif> ALL_GIFS = Arrays.asList(
          new Gif("android-explosion", 1, LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
          new Gif("ben-and-mike", 2, LocalDate.of(2015,10,30), "Ben Jakuben", true),
          new Gif("book-dominos", 3, LocalDate.of(2015,9,15), "Craig Dennis", false),
          new Gif("compiler-bot", 2,LocalDate.of(2015,2,13), "Ada Lovelace", true),
          new Gif("cowboy-coder", 3, LocalDate.of(2015,2,13), "Grace Hopper", false),
          new Gif("infinite-andrew", 1, LocalDate.of(2015,8,23), "Marissa Mayer", true)
  );

  public Gif findByName(String name) {
    for (Gif g : ALL_GIFS) {
      if(g.getName().equals(name)){
        return g;
      }
    }
    return null;
  }

  public List<Gif> getAllGifs() {
    return ALL_GIFS;
  }

  public List<Gif> getByCategory(int id) {
    List<Gif> resultList = new ArrayList<>();
    for(Gif g : ALL_GIFS) {
      if(g.getCategoryId() == id) {
        resultList.add(g);
      }
    }
    return resultList;
  }

  public List<Gif> getFavorites() {
    List<Gif> favoriteGifs = new ArrayList<>();
    for (Gif g : ALL_GIFS) {
      if(g.isFavorite()){
        favoriteGifs.add(g);
      }
    }
    return favoriteGifs;
  }
}
