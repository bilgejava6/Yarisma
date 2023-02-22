package com.muhammet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SoruOlusturRequestDto {
    String token;
    String clientip;
    String konu;
    String soruicerik;
    String cevapa;
    String cevapb;
    String cevapc;
    String cevapd;
    int dogrucevap;
    Long time;
    int puan;
}
