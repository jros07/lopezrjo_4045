package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */
public interface ISpecimenService {

	/**
	 * Get specimens for persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching ID
	 */
	SpecimenDTO fetchByID(int id);

	/**
	 * Persist the given DOT
	 * @param speciemenDTO
	 */
	void save(SpecimenDTO speciemenDTO);

}