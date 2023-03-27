package com.example.springvue.funeral_streams;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class FuneralStreamRepositoryTest {
    @Autowired
    private FuneralStreamRepository underTest;
    @Test
    void changeStreamStartTimeShouldWork() {// Basically, I'm checking if when I change something with my query it actually changes...
                                            //Tell me if this needs clarification
               //given
            FuneralStream earlyFuneralStream =
                    new FuneralStream(
                            "42g",
                            "f42g",22l,
                            Timestamp.valueOf("2000-10-10 09:09:00")
                    );

            Timestamp answer= Timestamp.valueOf("3000-10-10 09:09:00");
            underTest.save(earlyFuneralStream);

            //when

            underTest.changeStreamStartTime(earlyFuneralStream.getFuneralStreamId(),answer);

            Stream<FuneralStream> streamFilteredForTimeExpectedNewTimeStamp =
                underTest.findAll()
                        .stream().filter(funeralRecord ->funeralRecord.getStartTimestamp().equals(answer));


            FuneralStream firstObjectFromList = (FuneralStream) streamFilteredForTimeExpectedNewTimeStamp.toArray()[0];

        //then

            assertThat(firstObjectFromList).isNotNull(); //If we find that the stream we entered got updated, we're good to go!..
            assertThat(firstObjectFromList.getVimeoID()).isEqualTo(earlyFuneralStream.getVimeoID());
            System.err.println("\n"+"Original:"+earlyFuneralStream+"\nFinal:"+firstObjectFromList);
            /**
                The last part sums up what I did (it should be colored Red) and can be found if you scroll down through the test results
             **/


        //assertThat(answer).hasSameTimeAs();


    }
}