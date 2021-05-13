package com.inscription.course.model.api.acceptregistration.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Builder
public class AcceptRequest implements Serializable {

    private static final long serialVersionUID = 85969561342887L;

    @NotNull
    @ApiModelProperty(
            name = "docValue",
            value = "Valor de documento",
            dataType = "String",
            example = "76521485"
    )
    private String docValue;
}
