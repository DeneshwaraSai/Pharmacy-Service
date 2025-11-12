
package com.pharmacy.code.controller;

import java.util.List;

import com.pharmacy.code.dto.PatientMiniSearchDto;
import com.pharmacy.code.dto.PatientSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pharmacy.code.dto.PatientHeaderContext;
import com.pharmacy.code.dto.PatientSearchDto;
import com.pharmacy.code.entity.Patient;
import com.pharmacy.code.service.PatientService;

@CrossOrigin
@RestController
@RequestMapping("/api/patient/")
public class PatientController {

	private PatientService patientService;

	@Autowired
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping(path="v1/list")
	public List<Patient> findAllPatients() {
		return patientService.findAll();
	}

	@PostMapping(path="v1/save")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.save(patient);
	}

	@GetMapping(path="v1/{patientId}")
	public Patient getPatientById(@PathVariable(name = "patientId", required = true) Integer patientId ) {
		return patientService.findById(patientId);
	}

	@PutMapping(path="v1/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.save(patient);
	}

	@GetMapping(path="v1/search/{name}")
	public List<PatientMiniSearchDto> searchpatients(@PathVariable(name = "name", required=true) String name) {
		return patientService.searchpatients(name);
	}

	@PostMapping(path="v1/advancedSearch")
	public List<PatientSearchDto> advancedSearch(@RequestBody PatientSearch patientSearch) {
		return patientService.advancedSearch(patientSearch);
	}

	@GetMapping(path = "v1/uhid/{uhid}")
	public PatientHeaderContext findPatientByUhid(@PathVariable(name = "uhid", required=true) Integer uhid) {
		return patientService.findPatientByUhid(uhid);
	}
}
