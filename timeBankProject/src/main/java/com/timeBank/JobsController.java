package com.timeBank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class JobsController {

	@Autowired
	JobsService service;

	@RequestMapping(value = "addjobs", method = RequestMethod.GET)
	public String showJobs(Model model) {
		model.addAttribute("job", service.findAll());
		return "sesion";
	}

	@RequestMapping("/newJob")
	public String newJob(Model model, HttpSession session) {
		User user = (User) session.getAttribute("usersesion");
		List<Jobs> jobs = service.findByEmail(user);
		for (int i = 0; i < jobs.size(); i++) {
			System.out.println(jobs.get(i).getUser().getEmail());
		}
		model.addAttribute("jobs", jobs);
		return "/addjobs.html";
	}

	@RequestMapping("/addJob")
	public String insertJob(Jobs job, Model model, HttpSession session) {
		
		User user = (User) session.getAttribute("usersesion");
		job.setUser(user);
		job.setLocation(user.getLocation());
		job.setName(user.getName());
		service.insertJob(job);
		
		return "redirect:newJob";
	}

	@RequestMapping("/deleteJob")
	public String deleteJob(@RequestParam Integer id) {
		service.deleteJob(id);
		return "redirect:newJob";
	}
	
	@RequestMapping("/jobsByCategory")
	public String jobsByCategory(@RequestParam String category, Model model, HttpSession session) {
		System.out.println(category);
		List<Jobs> jobs = service.findByCategory(category);
		User user = (User)session.getAttribute("usersesion");
		model.addAttribute("jobs", jobs);
		model.addAttribute("user", user);
		return "jobsCategory";
	}
	
	
	
	@RequestMapping("/SelectJob")
	public void selectJob(Jobs job, Model model, HttpSession session) {
		if (session.isNew()) {
			
		} else {
			session.setAttribute("job", job);
		}
		
	}
	
	@RequestMapping("/sesionuser")
    public String sesion(Model model, HttpSession session) {
        User user = (User)session.getAttribute("usersesion");
       
        model.addAttribute("user", user);
		return"sesion.html";
    }
	
	@RequestMapping("/blockjob")
	public void blockJob(Jobs job, Model model, HttpSession session) {
		job.setDisponibility("unavailable");
	}

}