package com.zaina.voiture.restControllers;


import com.zaina.voiture.dto.APIResponseDto;
import com.zaina.voiture.service.VoitureService;
import com.zaina.voiture.config.Configuration;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voitures")
@AllArgsConstructor
public class VoitureController {

    private VoitureService voitureService;

    @Autowired
    Configuration configuration;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getVoitureById(@PathVariable("id")
                                                      Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                voitureService.getVoitureById(id), HttpStatus.OK);
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}

