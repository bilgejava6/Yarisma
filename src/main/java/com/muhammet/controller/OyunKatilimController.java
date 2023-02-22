package com.muhammet.controller;

import com.muhammet.service.OyunKatilimService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestEndPoints.*;
@RestController
@RequestMapping(VERSION+API+OYUNKATILIM)
@RequiredArgsConstructor
public class OyunKatilimController {
    private final OyunKatilimService oyunKatilimService;
}
