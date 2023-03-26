package com.example.springvue.funeral_streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuneralStreamService {
    private final FuneralStreamRepository funeralStreamRepository;
    @Autowired
    public FuneralStreamService(FuneralStreamRepository funeralStreamRepository){
            this.funeralStreamRepository =funeralStreamRepository;
    }

    public List<FuneralStream> listStreams(){

        return funeralStreamRepository.findAll();
    }
    public void addStream(FuneralStream stream){
        System.out.print(stream);
    }

    public Optional<FuneralStream> listStreamsByID(long funeralHomeID) {
        return funeralStreamRepository.findById(funeralHomeID);
    }
}
