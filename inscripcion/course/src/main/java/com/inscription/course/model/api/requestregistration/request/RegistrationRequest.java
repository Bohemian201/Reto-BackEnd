package com.inscription.course.model.api.requestregistration.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Builder
public class RegistrationRequest implements Serializable {

    private static final long serialVersionUID = 11234221932343L;

    @NotNull(message = "El nombre no debe estar vacío")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "El campo nombre solo acepta letras.")
    @ApiModelProperty(
            name = "firstName",
            value = "Nombres.",
            dataType = "String",
            example = "Julio Jose"
    )
    private String firstName;

    @NotNull(message = "El apellido paterno no debe estar vacío")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "El campo nombre solo acepta letras.")
    @ApiModelProperty(
            name = "fatherName",
            value = "Apellido paterno.",
            dataType = "String",
            example = "Roman"
    )
    private String fatherName;

    @NotNull(message = "El apellido materno no debe estar vacío")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "El campo nombre solo acepta letras.")
    @ApiModelProperty(
            name = "motherName",
            value = "Apellido materno.",
            dataType = "String",
            example = "Fernandez"
    )
    private String motherName;

    @NotNull(message = "El genero no debe estar vacío")
    @ApiModelProperty(
            name = "gender",
            value = "G&eacute;nero",
            dataType = "String",
            example = "M"
    )
    private String gender;

    @NotNull(message = "El valor del documento no debe estar vacío")
    @ApiModelProperty(
            name = "docType",
            value = "Tipo de documento",
            dataType = "String",
            example = "1:DNI || 2:Carnet de extranjeria"
    )
    private String docType;

    @NotNull(message = "El numero de documento no debe estar vacío")
    @ApiModelProperty(
            name = "docValue",
            value = "Valor de documento",
            dataType = "String",
            example = "76521485"
    )
    private String docValue;

    @NotNull(message = "El celular no debe estar vacío")
    @Size(min = 9, max = 9, message = "La longitud maxima del numero es de 9 cifras.")
    @Pattern(regexp = "(9)([0-9][ -]*){8}", message = "El numero de celular solo debe ser numeros")
    @ApiModelProperty(
            name = "cellphone",
            value = "N&uacute;mero de celular.",
            dataType = "String",
            example = "971845298"
    )
    private String cellphone;

    @NotNull(message = "La direccion no debe estar vacío")
    @ApiModelProperty(
            name = "address",
            value = "Direcci&oacute;n del empleado",
            dataType = "String",
            example = "Av. Brazil 783 Jesus Maria"
    )
    private String address;

    @NotNull(message = "El correo no debe estar vacío")
    @Pattern(regexp = "^[\\w-+]+(\\.[\\w-]{1,62}){0,126}@[\\w-]{1,63}(\\.[\\w-]{1,62})+/[\\w-]+$"
            , message = "Colocar un correo valido")
    @ApiModelProperty(
            name = "email",
            value = "Email del empleado.",
            dataType = "String",
            example = "Julio1995@hotmail.com"
    )
    private String email;

    @NotNull(message = "El curso no debe estar vacío")
    @ApiModelProperty(
            name = "course",
            value = "Curso",
            dataType = "String",
            example = "Diseño gr&aacute;fico"
    )
    private String course;
}
