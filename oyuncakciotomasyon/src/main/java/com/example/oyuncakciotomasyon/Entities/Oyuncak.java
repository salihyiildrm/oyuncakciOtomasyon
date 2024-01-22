package com.example.oyuncakciotomasyon.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


    @Entity
    @Data

    public class Oyuncak {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int Id;

        private LocalDate alisTarihi;

        private  Double alisFiyati;


        private  String ad;


        private  String tur;


        private  Integer desi;


        private  String notlar;





    }


