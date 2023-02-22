package com.muhammet.controller;

import com.muhammet.service.OyunService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestEndPoints.*;
@RestController
@RequestMapping(VERSION+API+OYUN)
@RequiredArgsConstructor
public class OyunController {
    private final OyunService oyunService;
}
