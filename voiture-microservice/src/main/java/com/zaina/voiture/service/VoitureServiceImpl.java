package com.zaina.voiture.service;

import com.zaina.voiture.dto.APIResponseDto;
import com.zaina.voiture.dto.MarqueDto;
import com.zaina.voiture.dto.VoitureDto;
import com.zaina.voiture.entities.Voiture;
import com.zaina.voiture.repos.VoitureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VoitureServiceImpl implements VoitureService{


    private APIClient apiClient;

    private VoitureRepository voitureRepository;


    @Override
    public APIResponseDto getVoitureById(Long id) {
        String marName;
        Voiture voit = voitureRepository.findById(id).get();

        MarqueDto marqueDto = apiClient.getMarqueByCode(voit.getCodeMarque());


        if(marqueDto==null)
            marName="NOT AVAILABLE";
        else
            marName= marqueDto.getName();

        VoitureDto voitureDto = new VoitureDto(
                voit.getId(),
                voit.getCouleur(),
                voit.getImmCode(),
                voit.getCodeMarque(),
                marName
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMarqueDto(marqueDto);
        apiResponseDto.setVoitureDto(voitureDto);
        return apiResponseDto;
    }
}
