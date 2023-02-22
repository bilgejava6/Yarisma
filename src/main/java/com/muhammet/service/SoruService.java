package com.muhammet.service;

import com.muhammet.dto.request.SoruOlusturRequestDto;
import com.muhammet.mapper.ISoruMapper;
import com.muhammet.repository.ISoruRepository;
import com.muhammet.repository.entity.Soru;
import com.muhammet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SoruService extends ServiceManager<Soru,Long> {
    private final ISoruRepository soruRepository;
    public SoruService(ISoruRepository soruRepository){
        super(soruRepository);
        this.soruRepository = soruRepository;
    }

    public void soruOlustur(SoruOlusturRequestDto dto){
        save(ISoruMapper.INSTANCE.fromSoruOlusturRequestDto(dto));
    }
}
