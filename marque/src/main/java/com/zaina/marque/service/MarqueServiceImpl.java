package com.zaina.marque.service;


import com.zaina.marque.dto.MarqueDto;
import com.zaina.marque.entities.Marque;
import com.zaina.marque.repos.MarqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MarqueServiceImpl implements MarqueService {

    private MarqueRepository marqueRepository;

    @Override
    public MarqueDto getMarqueByCode(String codeMarque) {
        Marque marque = marqueRepository.findByCodeMarque(codeMarque);
        return new MarqueDto(
                marque.getId(),
                marque.getNom(),
                marque.getCodeMarque()
        );

    }

}

