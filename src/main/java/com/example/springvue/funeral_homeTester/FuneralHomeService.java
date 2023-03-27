package com.example.springvue.funeral_homeTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void addHome(FuneralHome newcomer){
        funeralHomeRepository.save(newcomer);
    }

    public Optional<FuneralHome> listHomesByID(Long id) {
        return funeralHomeRepository.findById(id);
    }

    public void removeHomeByID(Long id) {
        funeralHomeRepository.deleteById(id);
    }

    public Optional<FuneralHome> listHomesByName(String name) {
        return funeralHomeRepository.findFuneralHomeByName(name);
    }
}
