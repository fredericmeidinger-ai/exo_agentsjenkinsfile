package ExoJenkinsAgent.jenkinsAgent.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping ("/api")
public class AlimentaireRestController {


	@GetMapping("/hello")
	public String afficherParId()
	{
		return "Hello World !";
	}


}
