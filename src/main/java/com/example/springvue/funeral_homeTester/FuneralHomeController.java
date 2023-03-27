package com.example.springvue.funeral_homeTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public Optional<FuneralHome> specifyFuneralHome(@PathVariable Long id){
        return funeralHomeService.listHomesByID(id);
    }
    @GetMapping("/using-name/{name}")
    public Optional<FuneralHome> findFuneralHomeByName(@PathVariable String name){
        return funeralHomeService.listHomesByName(name);
    }
    @PostMapping
    public String addFuneralHome(@RequestBody FuneralHome newcomer){
        funeralHomeService.listHomes().stream().anyMatch(funeralHome -> funeralHome.equals(newcomer));
        funeralHomeService.addHome(newcomer);
        return "{'response':'request succesful'}";
    }

    @DeleteMapping()
    public void removeFuneralHome(@RequestBody Long id){
         funeralHomeService.removeHomeByID(id);
    }//I'm averse to removing the funeral home by Name > what say you all?



}

