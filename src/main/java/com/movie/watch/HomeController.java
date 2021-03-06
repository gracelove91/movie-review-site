package com.movie.watch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("인데스 메인 페이지");
		model.addAttribute("page",null);
		return "index";
	}

	@RequestMapping(value = "/floatSection/board", method = RequestMethod.GET)
	public String floatSectionBoard(Model model) {
		logger.info("커뮤니티로 이동");
		model.addAttribute("page", "movieBoard");
		return "index";
	}

}
