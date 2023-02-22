package com.muhammet.controller;

import com.muhammet.service.OyuncuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestEndPoints.*;
@RestController
@RequestMapping(VERSION+API+OYUNCU)
@RequiredArgsConstructor
public class OyuncuController {
    private final OyuncuService oyuncuService;
}
