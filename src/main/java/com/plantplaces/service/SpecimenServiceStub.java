package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub {

	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		return specimenDTO;
	}
	
	public void save(SpecimenDTO speciemenDTO) {
		
	}
}
