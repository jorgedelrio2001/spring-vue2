package com.example.springvue.funeral_streams;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest
class FuneralStreamServiceTest {
    @Autowired
    private FuneralStreamService funeralStreamService;
    @Test
    public void mustNotCrashOnUpdateCall(){
        //Given
        FuneralStream newFuneralStream=new FuneralStream("1f1in", "sss", 2222l,
                Timestamp.valueOf("2000-12-10 10:10:00"));;

        //System.out.print(funeralStreamService.showHomeSpecificStream(2222l));

        //When

        funeralStreamService.addStream(newFuneralStream);


        //then
        funeralStreamService.setTimeOfFuneral(1,"Bad Input"); //Should not crash


    }

}