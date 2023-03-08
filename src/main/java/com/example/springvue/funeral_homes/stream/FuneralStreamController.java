package com.example.springvue.funeral_homes.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funeral_homes/")
public class FuneralStreamController {
    private final FuneralStreamService funeralStreamService;
    @Autowired
    public FuneralStreamController(FuneralStreamService fhs){
        funeralStreamService=fhs;
    }
    @GetMapping
    public List<FuneralStream> listStreams(){
        return funeralStreamService.listStreams();
    }
    @GetMapping("/{id}/streams")
    public Optional<FuneralStream> listStreamsbyID(@PathVariable String id){
        try {
            return funeralStreamService.listStreamsByID(Long.parseLong(id));
        }catch(InputMismatchException badval){
            System.out.print(badval);
            return null;
        }
    }
    @PostMapping
    public void addFuneralStream(@RequestBody FuneralStream newcomer){
        funeralStreamService.addStream(newcomer);
    }
}
