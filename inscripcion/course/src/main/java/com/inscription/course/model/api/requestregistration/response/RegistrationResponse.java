package com.inscription.course.model.api.requestregistration.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class RegistrationResponse implements Serializable {

    private static final long serialVersionUID = 99969561342887L;

    @ApiModelProperty(
            name = "code",
            value = "C&oacute;digo de respuesta.",
            dataType = "String",
            example = "0:Registrado correctamente || 1: Error al registrar"
    )
    private String code;

    @ApiModelProperty(
            name = "description",
            value = "Descripci&oacute;n de la respuesta.",
            dataType = "String",
            example = "Registrado correctamente "
    )
    private String description;

}
