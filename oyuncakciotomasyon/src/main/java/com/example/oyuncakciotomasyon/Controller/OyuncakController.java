package com.example.oyuncakciotomasyon.Controller;

import com.example.oyuncakciotomasyon.Entities.Oyuncak;
import com.example.oyuncakciotomasyon.Services.OyuncakService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/oyuncak")
public class OyuncakController {
    final OyuncakService oyuncakService;
    public OyuncakController(OyuncakService oyuncakService){
        this.oyuncakService = oyuncakService;
    }

    @PostMapping
    public Map save(@RequestBody Oyuncak oyuncak){
        return oyuncakService.save(oyuncak);


    }
@GetMapping("/list")
    public Map list(){
        return oyuncakService.list();
}
}
