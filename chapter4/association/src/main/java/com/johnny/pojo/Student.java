package com.johnny.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String cnName;
    private SexEnum sex;
    private String selfCardNo;
    private String note;
    private StudentSelfCard studentSelfcard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getSelfCardNo() {
        return selfCardNo;
    }

    public void setSelfCardNo(String selfCardNo) {
        this.selfCardNo = selfCardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public StudentSelfCard getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfCard studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }
}