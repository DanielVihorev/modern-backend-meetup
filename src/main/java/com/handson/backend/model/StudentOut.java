package com.handson.backend.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentOut {
    private Long id;
    private Date createdat;
    private String fullname;
    private Integer satscore;
    private Double graduationscore;
    private String phone;
    private String profilepicture;
    private Double avgscore;
}
