/*
 * package com.timeBank;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * javax.servlet.http.HttpSession;
 * 
 * @Controller
 * 
 * @RequestMapping("/") public class HistoryController {
 * 
 * @Autowired HistoryService service;
 * 
 * @RequestMapping(value="addhistory", method = RequestMethod.GET) public String
 * showHistory(Model model) { model.addAttribute("history", service.findAll());
 * return "sesion"; }
 * 
 * @SuppressWarnings("null")
 * 
 * @RequestMapping("/newHistory") public String newHistory(Model model,
 * HttpSession session) { Jobs job = (Jobs)session.getAttribute("job"); User
 * betaUser = job.getUser(); User alphaUser =
 * (User)session.getAttribute("usersesion"); History history = null;
 * history.setAlphaUser(alphaUser); history.setBetaUser(betaUser);
 * history.setJob(job); history.setState("In progress");
 * service.createHistory(history); return "sesion";
 * 
 * 
 * }
 * 
 * 
 * }
 */
