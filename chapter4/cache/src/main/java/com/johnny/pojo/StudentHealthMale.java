package com.johnny.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentHealthMale implements Serializable {
    private Integer id;
    private String student_id;
    private String check_date;
    private String heart;
    private String liver;
    private String spleen;
    private String lung;
    private String kidney;
    private String prostate;
    private String note;
}