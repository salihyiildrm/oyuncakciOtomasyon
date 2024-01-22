package com.example.oyuncakciotomasyon.dto;

import com.example.oyuncakciotomasyon.Entities.Oyuncak;
import org.springframework.stereotype.Component;

@Component

public class OyuncakDTOConverter {
    public OyuncakDto convert(Oyuncak oyuncak){
        return new OyuncakDto(oyuncak.getId(), oyuncak.getAlisTarihi(), oyuncak.getAlisFiyati());
    }
}
