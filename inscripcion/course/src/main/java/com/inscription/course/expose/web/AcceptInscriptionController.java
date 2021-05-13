package com.inscription.course.expose.web;

import com.inscription.course.business.AcceptInscriptionService;
import com.inscription.course.model.api.acceptregistration.request.AcceptRequest;
import com.inscription.course.model.api.acceptregistration.response.AcceptResponse;
import com.inscription.course.model.api.common.ExceptionError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "Accept-Inscription")
@RestController
@RequestMapping(value = "/inscription-management/v1")
public class AcceptInscriptionController {

    @Autowired
    private AcceptInscriptionService acceptInscriptionService;

    public AcceptInscriptionController(AcceptInscriptionService acceptInscriptionService) {
        this.acceptInscriptionService = acceptInscriptionService;
    }

    /**
     * Metodo getDirectoryList.
     *
     * @param request {@link AcceptRequest}.
     * @return {@link AcceptResponse}.
     */
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(
            value = "/accept-registration",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Confirma la inscripción del curso.",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            response = AcceptResponse.class,
            httpMethod = "POST",
            notes = "classpath:swagger/notes/accept-inscription.md")
    @ApiResponses({
            @ApiResponse(code = 200,
                    message = "Se registro satisfactoriamente.",
                        response = AcceptResponse.class,
                    responseContainer = "Observable"),
            @ApiResponse(code = 400,
                    message = "BAD REQUEST.")}
    )
    public AcceptResponse getDirectoryList(@Valid @RequestBody AcceptRequest request) throws ExceptionError {
        return acceptInscriptionService.acceptRegister(request);
    }
}
