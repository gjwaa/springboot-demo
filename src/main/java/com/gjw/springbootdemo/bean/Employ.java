package com.gjw.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employ {

    private Integer eID;
    private String eName;
    private String email;
    private int gender;//0女1男
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birth;
    private Department department;

    public Employ(Integer eID, String eName, String email, int gender, Department department) {
        this.eID = eID;
        this.eName = eName;
        this.email = email;
        this.gender = gender;
        this.birth = new Date();
        this.department = department;
    }
}
