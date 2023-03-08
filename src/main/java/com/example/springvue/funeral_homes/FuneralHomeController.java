package com.example.springvue.funeral_homes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funeral_homes")
public class FuneralHomeController {
    private final FuneralHomeService funeralHomeService;
    @Autowired
    public FuneralHomeController(FuneralHomeService fhs){
        funeralHomeService=fhs;
    }
    @GetMapping
    public List<FuneralHome> listFuneralHomes(){
        return funeralHomeService.listHomes();
    }
    @PostMapping
    public void addFuneralHome(@RequestBody FuneralHome newcomer){
        funeralHomeService.addHome(newcomer);
    }
}
