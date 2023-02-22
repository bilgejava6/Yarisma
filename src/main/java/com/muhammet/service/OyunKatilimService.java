package com.muhammet.service;

import com.muhammet.repository.IOyunKatilimRepository;
import com.muhammet.repository.entity.OyunKatilim;
import com.muhammet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyunKatilimService  extends ServiceManager<OyunKatilim,Long> {
    private final IOyunKatilimRepository oyunKatilimRepository;
    public OyunKatilimService(IOyunKatilimRepository oyunKatilimRepository){
        super(oyunKatilimRepository);
        this.oyunKatilimRepository = oyunKatilimRepository;
    }
}
