package com.pharmacy.code.service;

import java.util.List;
import java.util.Objects;

import com.pharmacy.code.dto.PatientMiniSearchDto;
import com.pharmacy.code.dto.PatientSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.pharmacy.code.dto.PatientHeaderContext;
import com.pharmacy.code.dto.PatientSearchDto;
import com.pharmacy.code.entity.Patient;
import com.pharmacy.code.repository.PatientRepository;

import jakarta.persistence.EntityManager;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    private EntityManager entityManager;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository, EntityManager entityManager) {
        this.patientRepository = patientRepository;
        this.entityManager = entityManager;
    }

    @Override
    public Patient save(Patient patient) {
        // TODO Auto-generated method stub
        List<Patient> patients = this.patientRepository.findAll();

        patient.setUhid(patients.size() + 1);

        return this.patientRepository.save(patient);
    }

    @Override
    public Patient findById(Integer id) {
        // TODO Auto-generated method stub
        return this.patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> findAll() {
        // TODO Auto-generated method stub
        return this.patientRepository.findAll();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<PatientMiniSearchDto> searchpatients(String value) {
        // TODO Auto-generated method stub

        List<PatientMiniSearchDto> patients = entityManager.createNamedQuery("PatientService.searchpatients")
                .setParameter("name", value)
                .getResultList();

        System.out.println(patients.toString());
        return patients;
    }

    @SuppressWarnings("unchecked")
    @Override
    public PatientHeaderContext findPatientByUhid(Integer uhid) {
        // TODO Auto-generated method stub

        List<PatientHeaderContext> context = entityManager.createNamedQuery("PatientService.findPatientByUhid")
                .setParameter("uhid", uhid)
                .getResultList();


        System.out.println(context.toString());
        if (!CollectionUtils.isEmpty(context)) {
            return context.get(0);
        }
        return null;
    }

    @Override
    public List<PatientSearchDto> advancedSearch(PatientSearch patientSearch) {

        patientSearch.setFirstName(Objects.isNull(patientSearch.getFirstName()) ? "" : patientSearch.getFirstName());
        patientSearch.setLastName(Objects.isNull(patientSearch.getLastName()) ? "" : patientSearch.getLastName());


        patientSearch.setPhoneNumber(Objects.isNull(patientSearch.getPhoneNumber()) ? null : patientSearch.getPhoneNumber());
        patientSearch.setOrderNumber(Objects.isNull(patientSearch.getOrderNumber()) ? null : patientSearch.getOrderNumber());

        System.out.println(patientSearch.toString());

        List<PatientSearchDto> dtoList = entityManager.createNamedQuery("PatientSearch.findAllNamesBySearchObject")
                .setParameter("orderNumber", patientSearch.getOrderNumber())
                .setParameter("firstName", patientSearch.getFirstName())
                .setParameter("lastName", patientSearch.getLastName())
                .setParameter("phoneNumber", patientSearch.getPhoneNumber())
                .getResultList();
        System.out.println(dtoList.toString());
        return dtoList;
    }
}
