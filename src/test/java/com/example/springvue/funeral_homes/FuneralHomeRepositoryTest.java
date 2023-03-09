package com.example.springvue.funeral_homes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//@DataJpaTest
@SpringBootTest
class FuneralHomeRepositoryTest {
    @Autowired
    private FuneralHomeRepository underTest;
    private FuneralHome fh=new FuneralHome(
            "ted",
            "tree",
            "tree"
    );
    @Test
    void repoShouldWork(){
        //given funeralHomeRepo exists
        underTest.save(fh);
        //when
        List<FuneralHome> funeralHomeList= underTest.findAll();
        assertThat(funeralHomeList.contains(fh));

    }
}