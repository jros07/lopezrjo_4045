package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.SpecimenServiceStub;

@Controller
public class PlantPlacesControllers {
	
	@Autowired
	private SpecimenServiceStub specimenServiceStub;
	
	/**
	 * Handles the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}	
	
	/**
	 * Handles the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	/**
	 * Handles the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handles the / endpoint
	 * @return
	 */
	@RequestMapping ("/")
	public String index() {
		return "start";
	}

}