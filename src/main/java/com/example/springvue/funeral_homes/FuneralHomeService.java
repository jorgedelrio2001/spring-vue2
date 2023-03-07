package com.example.springvue.funeral_homes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuneralHomeService {
    private final FuneralHomeRepository fhr;
    @Autowired
    public FuneralHomeService(FuneralHomeRepository fhr){
            this.fhr=fhr;
    }

    public List<FuneralHome> listHomes(){

        return fhr.findAll();
    }
    public boolean addHome(FuneralHome f){
        System.out.print(f);
        return true;
    }

}
