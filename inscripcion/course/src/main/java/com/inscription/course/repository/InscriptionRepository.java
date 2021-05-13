package com.inscription.course.repository;

import com.inscription.course.model.api.repository.InscriptionTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<InscriptionTable, String> {

    @Query(""
            + " update InscriptionTable it "
            + " set it.STATUS = I"
            + " where it.DOCUMENT_VALUE = :accountsId ")
    void updateRegister(
            @Param("docValue") String docValue);
}
