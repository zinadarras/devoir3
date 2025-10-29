package com.zaina.voiture.service;

import com.zaina.voiture.dto.APIResponseDto;
import com.zaina.voiture.dto.VoitureDto;

public interface VoitureService {
    APIResponseDto getVoitureById(Long id);
}
