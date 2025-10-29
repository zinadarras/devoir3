package com.zaina.voiture.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoitureDto {
    private Long id;
    private String Couleur;
    private String Imm;
    private String codeMarque;
    private String nomMarque;
}