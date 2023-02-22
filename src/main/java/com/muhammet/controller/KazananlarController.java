package com.muhammet.controller;

import com.muhammet.service.KazananlarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestEndPoints.*;
@RestController
@RequestMapping(VERSION+API+KAZANANLAR)
@RequiredArgsConstructor
public class KazananlarController {
    private final KazananlarService kazananlarService;
}
