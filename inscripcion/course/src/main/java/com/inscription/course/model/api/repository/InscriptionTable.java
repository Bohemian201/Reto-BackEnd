package com.inscription.course.model.api.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name = "TB_INSCRIPTION")
public class InscriptionTable {

    @Id
    @Column(name = "DOCUMENT_VALUE")
    private String docValue;
    @Column(name = "DOCUMENT_TYPE")
    private String docType;
    @Column(name = "NAME_PERSON")
    private String name;
    @Column(name = "FATHER_NAME_PERSON")
    private String fatherName;
    @Column(name = "MOTHER_NAME_PERSON")
    private String motherName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CELL_NUMBER")
    private String cellphone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "COURSE")
    private String course;
    @Column(name = "STATUS")
    private String status;
}

