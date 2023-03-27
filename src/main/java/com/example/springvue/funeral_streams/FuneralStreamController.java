package com.example.springvue.funeral_streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    @PostMapping("stream")
    public String addStream(@RequestBody FuneralStream stream){


        funeralStreamService.addStream(stream);

        return "{'request': 'successful'}";
    }
    @GetMapping("streamsFrom/home/{funeral_home_id}/")
    public Optional<FuneralStream> listFuneralHomeStreams(@PathVariable Long funeral_home_id){
        return funeralStreamService.showHomeSpecificStream(funeral_home_id);
    }
    @GetMapping("/specific/stream/{id}")
    public Optional<FuneralStream> listStreamByID(@PathVariable Long id){
        return funeralStreamService.listStreamsByID(id);
    }
    @PostMapping("streams")
    public void addFuneralStream(@RequestBody FuneralStream newcomer){
        funeralStreamService.addStream(newcomer);
    }

    @PostMapping("/setStreamTime") //this might be lofty for no reason
    public String setFuneralTime(@RequestBody long streamID, @RequestBody String time){
     if(funeralStreamService.setTimeOfFuneral(streamID,time)) return "Good syntax";

     return "Bad syntax";
    }
}

