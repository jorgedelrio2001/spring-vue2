package com.example.springvue.funeral_homeTester;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FuneralHomeTest {

    @Autowired
    private FuneralHomeRepository underTest;

    @Test
    void ConstructorWithArgsShouldWork() {
        //Given
        FuneralHome funeralHome;
        //when
        funeralHome = new FuneralHome("ChickenChasR","nothing","nothing");

        //then

        assert funeralHome.getName().equals("ChickenChasR");
        assert funeralHome.getIntro_video().equals("nothing");
        assert funeralHome.getOutro_video().equals("nothing");
    }

    @Test
    void testEquals() {
        //given
        FuneralHome funeralHome;
        FuneralHome funeralHome1;
        FuneralHome funeralHome2;
        //when
        funeralHome = new FuneralHome("ChickenChasR","nothing","nothing");

         funeralHome1= new FuneralHome("ChickenChasR","nothing","nothing");
        funeralHome2= new FuneralHome("MonkQuasar","not nothing","not nothing");
        //then
        assertEquals(funeralHome,funeralHome1);
        assertNotEquals(funeralHome,funeralHome2);
        assertThat(funeralHome).isEqualTo(funeralHome1);
    }

}