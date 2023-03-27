package com.example.springvue.funeral_streamTester;

import com.example.springvue.funeral_streams.FuneralStream;
import com.example.springvue.funeral_streams.FuneralStreamService;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FuneralStreamTest {
    @Test
    public void smallConstructorMustWork(){
        //given
        FuneralStream underTest;
        //when
        underTest= new FuneralStream("1234","pakio",1234);
        //then
        assertNotNull(underTest);
        assertEquals("1234",underTest.getCode());
        assertEquals("pakio",underTest.getVimeoID());
        assertEquals(1234,underTest.getFuneralHomeID());

    }
    @Test
    public void bigConstructorIsAlright(){
        FuneralStream underTest;
        Timestamp expected= Timestamp.valueOf("2023-03-26 04:00:00");
        //when

        underTest= new FuneralStream(
                "1234",
                "pakio",
                1234,
                expected
        );
        //then
        /**
         * We don't have to test the code, vimeo_id or funeral_home_id
         * cuz we checked them earlier.
         * */
        assertThat(expected).hasSameTimeAs(underTest.getStartTimestamp());

    }
    @Test
    public void saveUrlSetterMustWork(){
        //given
        FuneralStream funeralStream= new FuneralStream("code","identifier",29292l);
        //when
        funeralStream.setPathToSavedRecording("h");
        assertThat("h").isEqualTo(funeralStream.getPathToSavedRecording());
    }
    @Test
    public void startTimeSetterMustWork(){
        //given
            FuneralStream fab;
            String timeString= "2023-03-26 02:04:69";//"yyyy-[m]m-[d]d hh:mm:ss";

        //when
            fab=new FuneralStream("1234","1304",1);
            fab.setStartTimeStamp(Timestamp.valueOf(timeString));

        //then
        assertThat(fab.getStartTimestamp()).hasSameTimeAs(Timestamp.valueOf(timeString));
    }


}