package com.example.springvue.funeral_homes;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

//table, ID and Entity all come from javax.persistence
@Entity
@Data // very nifty lombok annotation that auto adds getters and setters for all ur variables
@GenericGenerator(name="funeral_home_id",strategy ="funeral_home_id")
@Table( catalog="livestream",name="funeral_homes",schema="livestream") //intellij is whining that it cant find the params
public class FuneralHome {
    public FuneralHome(){

    }
    @Id
    @GeneratedValue(generator = "funeral_home_ids")
    @Column(name = "funeral_home_id", unique = true, nullable = false)
    private Long id;//guys should we use int or BIGINT in mysql?
    @Column(name="code",length=80)
    private String code;
    @Column(name="vimeo_id",length=80)
    private String vimeo_id;
    @Column(name="path_to_saved_recording",length=80)
    private String path_to_saved_recording;
    @Column(name="start_timestamp",length=80)
    private Timestamp start_timestamp;


    public FuneralHome(String code,String vimeo_id, String path_to_saved_recording,Timestamp start_timestamp){
        this.code=code;
        this.vimeo_id=vimeo_id;
        this.path_to_saved_recording=path_to_saved_recording;
        this.start_timestamp=start_timestamp;
    }

}
