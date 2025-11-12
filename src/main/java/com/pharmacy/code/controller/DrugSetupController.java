package com.pharmacy.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pharmacy.code.dto.DrugSetupDto;
import com.pharmacy.code.entity.DrugSetup;
import com.pharmacy.code.service.DrugSetupService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/drug/")
public class DrugSetupController {
	
	private DrugSetupService drugSetupService;
	 
	@Autowired
	public DrugSetupController(DrugSetupService drugSetupService) {
		this.drugSetupService = drugSetupService;
	}
	
	@GetMapping(path = "v1/{id}")
	public DrugSetup findById(@PathVariable(name = "id", required = true) Integer id) {
		return drugSetupService.findById(id);
	}
	
	@PostMapping(path = "v1/save")
	public DrugSetup save(@RequestBody @Valid DrugSetup drugSetup) {
		System.out.println(drugSetup.toString());
		return drugSetupService.save(drugSetup);
	}
	
	@PutMapping(path = "v1/update")
	public DrugSetup update(@RequestBody DrugSetup drugSetup) {
		return drugSetupService.update(drugSetup);
	}
	
	@GetMapping(path = "v1/all")
	public List<DrugSetupDto> findAll(@RequestParam(name = "name", defaultValue = "") String name) {
 		return drugSetupService.findAllDrugByName(name);
	}
	
	@GetMapping(path = "v1/name")
	public List<DrugSetupDto> findAllDrugByName(@RequestParam(name = "name") String name) {
		return drugSetupService.findAllDrugByName(name);
	}
}
