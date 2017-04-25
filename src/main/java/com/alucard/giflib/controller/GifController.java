package com.alucard.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alucard on 24-Apr-17.
 */
@Controller
public class GifController {

  @RequestMapping("/")
  public String listGifs() {
    return "home";
  }

}
