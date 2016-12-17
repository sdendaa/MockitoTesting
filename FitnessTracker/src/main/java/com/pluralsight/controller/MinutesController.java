package com.pluralsight.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("Exercise Minutes: " + exercise.getMinutes());
		System.out.println("Exercise Activity: " + exercise.getActivity());
//		return "forward:addMoreMinutes.html";// to keep the result when forward to another page
		//return "redirect:addMoreMinutes.html";// loose data when redirect to another 
		//pages(good for credit card transation)
		return "addMinutes"; 
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//
//		System.out.println("Exercising " + exercise.getMinutes());
//		return "addMinutes";
//	}
	@RequestMapping(value ="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> getAllActivity(){
		return exerciseService.getAllActivities();
		
	}
}
