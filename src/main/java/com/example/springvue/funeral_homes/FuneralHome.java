package com.example.springvue.funeral_homes;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
    private Long funeralHomeId;//guys should we use int or BIGINT in mysql?
    @Column(name="intro_video",length=480)
    private String intro_video;
    @Column(name="outro_video",length=480)
    private String outro_video;
    @Column(name="name",length=160)
    private String name;


    public FuneralHome( String name, String intro_video,String outro_video){
        this.name=name;
        this.intro_video=intro_video;
        this.outro_video=outro_video;
    }

}
