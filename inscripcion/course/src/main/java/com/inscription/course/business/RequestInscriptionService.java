package com.inscription.course.business;

import com.inscription.course.model.api.common.ExceptionError;
import com.inscription.course.model.api.requestregistration.request.RegistrationRequest;
import com.inscription.course.model.api.requestregistration.response.RegistrationResponse;

public interface RequestInscriptionService {
    RegistrationResponse requestRegister(RegistrationRequest registrationRequest) throws ExceptionError;
}
