package com.inscription.course.expose.web;

import com.inscription.course.business.RequestInscriptionService;
import com.inscription.course.model.api.acceptregistration.request.AcceptRequest;
import com.inscription.course.model.api.acceptregistration.response.AcceptResponse;
import com.inscription.course.model.api.common.ExceptionError;
import com.inscription.course.model.api.requestregistration.request.RegistrationRequest;
import com.inscription.course.model.api.requestregistration.response.RegistrationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/inscription-management/v1")
public class RequestInscriptionController {

    @Autowired
    private RequestInscriptionService requestInscriptionService;

    public RequestInscriptionController(RequestInscriptionService requestInscriptionService) {
        this.requestInscriptionService = requestInscriptionService;
    }

    /**
     * Metodo getDirectoryList.
     *
     * @param request {@link RegistrationRequest}.
     * @return {@link RegistrationResponse}.
     */
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(
            value = "/request-registration",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Registra la inscripción del curso.",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            response = RegistrationResponse.class,
            httpMethod = "POST",
            notes = "classpath:swagger/notes/request-inscription.md")
    @ApiResponses({
            @ApiResponse(code = 200,
                    message = "Se solicito la inscripcion satisfactoriamente.",
                    response = RegistrationResponse.class),
            @ApiResponse(code = 400,
                    message = "BAD REQUEST.")}
    )

    public RegistrationResponse getDirectoryList(@Valid @RequestBody RegistrationRequest request) throws ExceptionError {
        return requestInscriptionService.requestRegister(request);
    }
}
