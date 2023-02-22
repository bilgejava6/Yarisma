package com.muhammet.mapper;

import com.muhammet.dto.request.SoruOlusturRequestDto;
import com.muhammet.repository.entity.Soru;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISoruMapper {
    ISoruMapper INSTANCE = Mappers.getMapper(ISoruMapper.class);
    Soru fromSoruOlusturRequestDto(final SoruOlusturRequestDto dto);
}
