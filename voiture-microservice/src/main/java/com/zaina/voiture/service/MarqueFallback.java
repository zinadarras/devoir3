package com.zaina.voiture.service;

import com.zaina.voiture.dto.MarqueDto;
import org.springframework.stereotype.Component;
@Component
public class MarqueFallback implements APIClient{
    @Override
    public MarqueDto getMarqueByCode(String marqueCode) {
        return null;
    }

}
