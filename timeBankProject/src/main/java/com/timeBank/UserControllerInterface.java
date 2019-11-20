package com.timeBank;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserControllerInterface {

	String showUser(Model model);

	String registro(User user, Model model, HttpSession sesion);

	String login(User user, Model model, HttpSession sesion);

}