package com.muhammet.service;

import com.muhammet.repository.IOyuncuRepository;
import com.muhammet.repository.entity.Oyuncu;
import com.muhammet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyuncuService extends ServiceManager<Oyuncu,Long> {
    private final IOyuncuRepository oyuncuRepository;
    public OyuncuService(IOyuncuRepository oyuncuRepository){
        super(oyuncuRepository);
        this.oyuncuRepository = oyuncuRepository;
    }
}
