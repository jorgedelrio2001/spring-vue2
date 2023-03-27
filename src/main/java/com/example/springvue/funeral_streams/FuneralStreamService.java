package com.example.springvue.funeral_streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.sql.Timestamp;
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
        funeralStreamRepository.save(stream);
    }

    public Optional<FuneralStream> listStreamsByID(long Id) {
        return funeralStreamRepository.findById(Id);
    }
    public Optional<FuneralStream> showHomeSpecificStream(long funeralHomeId){
        return funeralStreamRepository.findFuneralStreamsByFuneralHomeID(funeralHomeId);
    }

    /**
     *
     * TIMESTAMP FORMAT needs to be "yyyy-[m]m-[d]d hh:mm:ss"
     * You 'can' add milliseconds, but that's a waste of time
     * @param streamID
     * @param timeString
     * @return
     */

    public boolean setTimeOfFuneral(long streamID, String timeString){
        try {
            funeralStreamRepository.changeStreamStartTime(streamID, Timestamp.valueOf(timeString));
        }catch(IllegalArgumentException illegalArgumentException){
            return false;
        }
        return true;


    }


}
