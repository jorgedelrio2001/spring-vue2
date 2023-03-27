package com.example.springvue.funeral_streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class FuneralStreamController {
    private final FuneralStreamService funeralStreamService;
    @Autowired
    public FuneralStreamController(FuneralStreamService fhs){
        funeralStreamService=fhs;
    }
    @GetMapping("streams")
    public List<FuneralStream> listStreams(){
        return funeralStreamService.listStreams();
    }

    @GetMapping("streamsFrom/home/{funeral_home_id}/")//path variables get trimmed automatically
    public Optional<FuneralStream> listFuneralHomeStreams(@PathVariable Long funeral_home_id){
        return funeralStreamService.showHomeSpecificStream(funeral_home_id);
    }
    @GetMapping("specific/stream/{id}")
    public Optional<FuneralStream> listStreamByID(@PathVariable Long id){
        return funeralStreamService.listStreamsByID(id);
    }


    @PutMapping("setStreamTime/{streamID}/{time}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String setFuneralTime(@PathVariable long streamID, @PathVariable String time) throws IllegalAccessException {

        System.out.println("Would you look at the time!?: "+time);
     if(funeralStreamService.setTimeOfFuneral(streamID,time)) return "Good syntax";

     else throw(new IllegalAccessException("rip"));
    }

    @PostMapping("stream")
    public void addStream(@RequestBody FuneralStream turkey){
        System.out.println(turkey.getStartTimestamp());
        funeralStreamService.addStream(turkey);
    }
}

