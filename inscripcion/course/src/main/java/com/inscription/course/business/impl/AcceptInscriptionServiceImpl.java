package com.inscription.course.business.impl;

import com.inscription.course.business.AcceptInscriptionService;
import com.inscription.course.model.api.acceptregistration.request.AcceptRequest;
import com.inscription.course.model.api.acceptregistration.response.AcceptResponse;
import com.inscription.course.model.api.common.ExceptionError;
import com.inscription.course.repository.InscriptionRepository;
import org.springframework.stereotype.Service;

import static com.inscription.course.constants.Constants.SQL_ERROR;

@Service
public class AcceptInscriptionServiceImpl implements AcceptInscriptionService {

    private InscriptionRepository repository;

    public AcceptInscriptionServiceImpl(InscriptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public AcceptResponse acceptRegister(AcceptRequest acceptRequest) throws ExceptionError {
        try {
            //repository.updateRegister(acceptRequest.getDocValue());
            return AcceptResponse.builder()
                    .code("0")
                    .description("Se registro correctamente.")
                    .build();
        } catch (Exception e) {
            throw ExceptionError.builder()
                    .code(SQL_ERROR)
                    .description(e.getMessage())
                    .build();
        }
    }
}
