package com.inscription.course.business.impl;

import com.inscription.course.business.RequestInscriptionService;
import com.inscription.course.model.api.common.ExceptionError;
import com.inscription.course.model.api.repository.InscriptionTable;
import com.inscription.course.model.api.requestregistration.request.RegistrationRequest;
import com.inscription.course.model.api.requestregistration.response.RegistrationResponse;
import com.inscription.course.repository.InscriptionRepository;
import org.springframework.stereotype.Service;

import static com.inscription.course.constants.Constants.SQL_ERROR;

@Service
public class RequestInscriptionServiceImpl implements RequestInscriptionService {

    private InscriptionRepository repository;

    public RequestInscriptionServiceImpl(InscriptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public RegistrationResponse requestRegister(RegistrationRequest registrationRequest) throws ExceptionError {
        try {
            repository.save(buildRepositoryRequest(registrationRequest));
            return RegistrationResponse.builder()
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

    private InscriptionTable buildRepositoryRequest(RegistrationRequest request) {
        return InscriptionTable.builder()
                .name(request.getFirstName())
                .fatherName(request.getFatherName())
                .motherName(request.getMotherName())
                .gender(request.getGender())
                .docType(request.getDocType())
                .docValue(request.getDocValue())
                .email(request.getEmail())
                .address(request.getAddress())
                .cellphone(request.getCellphone())
                .course(request.getCourse())
                .build();
    }
}
