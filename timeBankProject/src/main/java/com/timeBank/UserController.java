package com.timeBank;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserController implements UserControllerInterface {

	@Autowired
	UserService userService;

	@Override
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String showUser(Model model) {
		model.addAttribute("user", userService.findAll());
		return "index";
	}

	@Override
	@RequestMapping("/registro")
	public String registro(User user, Model model, HttpSession sesion) {

		if (userService.emailExist(user.getEmail())) {
			return "index";
		} else {
			user.setHoras(5);
			userService.insertUser(user);
			sesion.setAttribute("usersesion", user);
			return "addJobs";
		}
	}

	@Override
	@RequestMapping("/login")
	public String login(User user, Model model, HttpSession sesion) {

		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		User user1 = userService.findById(user.getEmail());
		if (user.getPassword().equals(user1.getPassword())) {

			model.addAttribute("user", userService.findById(user.getEmail()));
			sesion.setAttribute("usersesion", user);
			System.out.println("ok");

			return "sesion.html";
		}
		System.out.println("ko");
		return "sesion.html";
	}

}
