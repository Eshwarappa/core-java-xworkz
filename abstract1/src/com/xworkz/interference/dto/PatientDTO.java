package com.xworkz.interference.dto;

import com.xworkz.interference.constants.BloodGroup;
import com.xworkz.interference.constants.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString



public class PatientDTO {

    private int id ;
    private String name;
    private String disease;
    private BloodGroup bloodGroup ;
    private Gender gender ;
    //private Status status ;
    private String hospitalName;
    private String doctorName;
    private String address ;

}
