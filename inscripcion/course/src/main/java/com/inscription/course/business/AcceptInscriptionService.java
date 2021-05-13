package com.inscription.course.business;

import com.inscription.course.model.api.acceptregistration.request.AcceptRequest;
import com.inscription.course.model.api.acceptregistration.response.AcceptResponse;
import com.inscription.course.model.api.common.ExceptionError;


public interface AcceptInscriptionService {
    AcceptResponse acceptRegister(AcceptRequest acceptRequest) throws ExceptionError;
}
