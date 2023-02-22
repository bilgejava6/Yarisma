package com.muhammet.service;

import com.muhammet.repository.IOyunRepository;
import com.muhammet.repository.entity.Oyun;
import com.muhammet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyunService extends ServiceManager<Oyun,Long> {
    private final IOyunRepository oyunRepository;
    public OyunService(IOyunRepository oyunRepository){
        super(oyunRepository);
        this.oyunRepository = oyunRepository;
    }
}
