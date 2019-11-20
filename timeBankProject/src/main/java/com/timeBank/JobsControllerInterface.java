package com.timeBank;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface JobsControllerInterface {

	String showJobs(Model model);

	String newJob(Model model, HttpSession session);

	String insertJob(Jobs job, Model model, HttpSession session);

	String deleteJob(Integer id);

	String jobsByCategory(String category, Model model, HttpSession session);

	String selectJob(JobsInterface job, Model model, HttpSession session);

	String sesion(Model model, HttpSession session);

}