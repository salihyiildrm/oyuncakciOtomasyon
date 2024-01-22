package com.example.oyuncakciotomasyon.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class OyuncakDto {
    private int id;
    private LocalDate alisTarihi;
    private  Double alisFiyati;

    public OyuncakDto(int id,LocalDate alisTarihi,Double alisFiyati) {
        this.id=id;
        this.alisTarihi=LocalDate.of(2022, 1, 21);;
        this.alisFiyati= 58.0;



    }
}
