package com.example.oyuncakciotomasyon.Services;

import com.example.oyuncakciotomasyon.Controller.OyuncakController;
import com.example.oyuncakciotomasyon.Entities.Oyuncak;
import com.example.oyuncakciotomasyon.Repository.OyuncakRepository;
import com.example.oyuncakciotomasyon.dto.OyuncakDTOConverter;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class OyuncakService {
    @Autowired

    private OyuncakRepository oyuncakRepository;

    // Oyuncak Ekleme
    public Oyuncak oyuncakEkle(Oyuncak oyuncak) {
        return oyuncakRepository.save(oyuncak);
    }

    // Oyuncakları Listeleme
    public List<Oyuncak> oyuncaklariListele() {
        return oyuncakRepository.findAll();
    }

    // ID'ye göre Oyuncak Getirme
    public Optional<Oyuncak> oyuncakGetirById(Long id) {
        return oyuncakRepository.findById(id);
    }

    // Oyuncak Güncelleme
    public Oyuncak oyuncakGuncelle(Long id, Oyuncak yeniOyuncak) {
        if (oyuncakRepository.existsById(id)) {
            yeniOyuncak.setId(id);
            return oyuncakRepository.save(yeniOyuncak);
        }
        return null; // Belirtilen ID ile bir oyuncak bulunamadı
    }

    // ID'ye göre Oyuncak Silme
    public void oyuncakSil(Long id) {
        oyuncakRepository.deleteById(id);
    }
}






  /*  final OyuncakRepository oyuncakRepository;
    final OyuncakDTOConverter oyuncakDTOConverter;
    public OyuncakService(OyuncakRepository oyuncakRepository ,OyuncakDTOConverter oyuncakDTOConverter){
        this.oyuncakRepository = oyuncakRepository;
        this.oyuncakDTOConverter = oyuncakDTOConverter;
    }

    public Map save(Oyuncak oyuncak) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("result", oyuncakDTOConverter.convert(oyuncakRepository.save(oyuncak)));
        result.put("statues", "");
        result.put("message", "");
        return result;
    }
    public Map list(){

        Map<String, Object> numbers  = new LinkedHashMap<>();//veri sıraya göre bastırır.
        Oyuncak pn = new Oyuncak();
        numbers.put("statues", true);
        numbers.put("result", oyuncakRepository.findAll().stream().map(oyuncakDTOConverter::convert).collect(Collectors.toList()));
        return numbers;
    }

}*/
