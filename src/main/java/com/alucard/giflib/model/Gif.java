package com.alucard.giflib.model;

import java.time.LocalDate;

/**
 * Created by Alucard on 25-Apr-17.
 */
public class Gif {
  private String name;
  private LocalDate dateUploaded;
  private String username;
  private boolean favorite;

  public Gif(String name, LocalDate dateUploaded, String username, boolean favorite) {
    this.name = name;
    this.dateUploaded = dateUploaded;
    this.username = username;
    this.favorite = favorite;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateUploaded() {
    return dateUploaded;
  }

  public void setDateUploaded(LocalDate dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(boolean favorite) {
    this.favorite = favorite;
  }
}
