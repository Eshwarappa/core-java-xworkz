package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.constants.Status;
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
    private Status status ;
    private String hospitalName;
    private String doctorName;
    private String address ;


}
