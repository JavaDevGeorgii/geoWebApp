package geo.springwebapp.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class WelcomeController {

	private int visitorCount=-1;
	@RequestMapping("/")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome visitor!");
		model.addAttribute("visitorCount", visitorCount++);
		return "index";
	}
}