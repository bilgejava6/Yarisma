package com.muhammet.controller;

import com.muhammet.dto.request.SoruOlusturRequestDto;
import com.muhammet.dto.response.ResultDto;
import com.muhammet.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.muhammet.constants.RestEndPoints.*;
@RestController
@RequestMapping(VERSION+API+SORU)
@RequiredArgsConstructor
public class SoruController {
    private final SoruService soruService;

    /**
     * PostMapping -> isteğin post şeklinde atılmasını zorunlu kılar. ve parametreleri body içinden talep eder.
     * @RequestBody -> post içinde gelen body parametrelerini karşılayabilmek için kullanılır. kullanılmaz ise
     * değerler null olarak gelir.
     * @CrossOrigin -> gelen isteklerin belli ip lerden yada belirlenen sunuculardan gelmesini istiyorsak kullanırız.
     * kullanılmaz ise tüm istekleri sadece localhost ya da barındığı site içinden alır. diğer istekleri red eder.
     * @param dto
     * @return
     */
    @PostMapping(SORUOLUSTUR)
    @CrossOrigin(origins = "*")
    public ResponseEntity<ResultDto> soruOlustur(@RequestBody SoruOlusturRequestDto dto){
        soruService.soruOlustur(dto);
        return ResponseEntity.ok(ResultDto.builder().state(true).build());
    }
}
