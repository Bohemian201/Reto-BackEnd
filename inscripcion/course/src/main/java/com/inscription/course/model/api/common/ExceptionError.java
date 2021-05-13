package com.inscription.course.model.api.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class ExceptionError extends Throwable implements Serializable {

    private static final long serialVersionUID = 99985261342887L;

    @ApiModelProperty(
            name = "code",
            value = "C&oacute;digo de error",
            dataType = "String",
            example = "0:Registrado correctamente || 1: Error al registrar"
    )
    private String code;

    @ApiModelProperty(
            name = "description",
            value = "Descripci&oacute;n del error",
            dataType = "String",
            example = "Registrado correctamente "
    )
    private String description;

}
