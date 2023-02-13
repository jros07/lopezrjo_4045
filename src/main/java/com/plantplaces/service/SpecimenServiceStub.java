package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO speciemenDTO) {
		
	}
}
