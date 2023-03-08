package com.example.springvue.funeral_homes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuneralHomeService {
    private final FuneralHomeRepository funeralHomeRepository;
    @Autowired
    public FuneralHomeService(FuneralHomeRepository funeralHomeRepository){

        this.funeralHomeRepository=funeralHomeRepository;
    }

    public List<FuneralHome> listHomes(){

        return funeralHomeRepository.findAll();
    }
    public void addHome(FuneralHome f){
        System.out.print(f);
    }

}
