package com.example.springvue.funeral_homes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@DataJpaTest
@SpringBootTest
class FuneralHomeRepositoryTest {
    @Autowired
    private FuneralHomeRepository underTest;

    @Test
    void HomeMustBeGivenID(){
        //given
        FuneralHome chad;
        //when
        chad= new FuneralHome("Chad","cool","cool");

        underTest.save(chad);
        FuneralHome chadButInRepository = underTest.findAll().get(0);
        //then
        assertThat(underTest.findAll().contains(chad));//making sure that chad gets added
        assertThat(chadButInRepository.getFuneralHomeId()).isNotZero();//making sure repository gives Funeral an ID
        assertThat(chadButInRepository.getFuneralHomeId()).isNotNull();//making sure twice
        System.err.print("Contents of "+ chadButInRepository); //Checking with my own two eyes
        /*You'll see what I printed in red if u scroll through test*/


    }

    @Test
    void repoShouldWork(){
        //given funeralHomeRepo exists
         FuneralHome fh=new FuneralHome(
                 "ted",
                 "tree",
                 "tree"
         );
        underTest.save(fh);
        //when


        List<FuneralHome> funeralHomeList= underTest.findAll();
        //then

        assertThat(funeralHomeList.contains(fh));

    }
}