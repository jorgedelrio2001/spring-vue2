package com.example.springvue.funeral_streams;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

//table, ID and Entity all come from javax.persistence
@Entity
@Data // very nifty lombok annotation that auto adds getters and setters for all ur variables
@GenericGenerator(name="funeral_streams",strategy ="funeral_stream_id")
@Table( catalog="livestream",name="funeral_streams",schema="livestream") //intellij is whining that it cant find the params
public class FuneralStream {
    public FuneralStream(){

    }
    /***
     * I found out that having underlines for the java version of the values causes errors
     * Use Camel case for java variables.
     * the Column annotation part can keep the underlines
     * */
    @Id
    @GeneratedValue(generator = "funeral_home_ids")
    @Column(name = "funeral_stream_id", unique = true, nullable = false)
    private Long funeralStreamId;//guys should we use int or BIGINT in mysql?
    @Column(name="code",length=80)
    private String code;
    @Column(name="vimeo_id",length=80)
    private String vimeoID; //I want to rename this to vimeoURLKey or something like that
    @Column(name="path_to_saved_recording",length=80)
    private String pathToSavedRecording;
    //private URL pathToSavedRecording; //**I might change the Path to URL(waiting on meeting)
    @Column(name="start_timestamp",length=80)
    private Timestamp startTimestamp;
    @Column(name="funeral_home_id")
    private Long funeralHomeID;

    /**
     *
     * Meant for user-friendliness > The user shouldn't have to memorize Timestamp format
     * @param code
     * @param vimeo_id
     * @param funeralHomeID
     */
    public FuneralStream(String code, String vimeo_id, long funeralHomeID){
        this.code=code;
        this.vimeoID=vimeo_id;
        this.funeralHomeID = funeralHomeID;

    }

    /**
     * This is so that we can send everything in one fell swoop
     * ( It's possible we'll only need this one)
     * I neglected to add "path_to_saved_stream" to params
     * because it's something we set up after everything is over
     * @param code
     * @param vimeo_id
     * @param funeralHomeID
     * @param startTimeStamp
     *
     */
    public FuneralStream(String code, String vimeo_id, long funeralHomeID, Timestamp startTimeStamp){
        this(code, vimeo_id, funeralHomeID);

        this.startTimestamp=startTimeStamp;
    }

        //My reason for making timestamp separate is to make the constructor shorter
    //We'll add security to this in the controller

    public void setStartTimeStamp(Timestamp newtimeStamp) {
        this.startTimestamp= newtimeStamp;
    }
    public void setPathToSavedRecording(String newPathToSavedRecording){
        this.pathToSavedRecording=newPathToSavedRecording;
    }

}
