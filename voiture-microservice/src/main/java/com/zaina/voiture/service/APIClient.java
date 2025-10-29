package com.zaina.voiture.service;

import com.zaina.voiture.dto.MarqueDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(url = "http://localhost:8080", value = "MARQUE")
@FeignClient( name = "MARQUE")
public interface APIClient {
    @GetMapping("/api/marques/{code}")
    MarqueDto getMarqueByCode(@PathVariable("code") String code );
}
