package com.muhammet.service;

import com.muhammet.repository.IKazananlarRepository;
import com.muhammet.repository.entity.Kazananlar;
import com.muhammet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KazananlarService extends ServiceManager<Kazananlar,Long> {
    private final IKazananlarRepository kazananlarRepository;
    public KazananlarService(IKazananlarRepository kazananlarRepository){
        super(kazananlarRepository);
        this.kazananlarRepository = kazananlarRepository;
    }
}
