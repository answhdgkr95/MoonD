package ju.moon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MoonDController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("test");
		return "/test";
	}
}