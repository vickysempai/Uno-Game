package controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import unogame.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UnoController {
	//@Autowired 
	UnoGame game =new UnoGame();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request,Locale locale, Model model) {
		//return "login";
		model.addAttribute("userName", request.getRemoteAddr());
		return "startmenu";
	}
	@RequestMapping(value = "/juego", method = RequestMethod.POST)
	public String juego(HttpServletRequest request,Locale locale, Model model) {
		/*cuando el usuario envia algo, este lo ejecuta
		el metodo recibe un iindice de una carta de su mazo
		y pasa su id de usuario(ip)*/
		
		//game.jugar(usuario,numero)
		
		String usuario = request.getRemoteAddr();
		model.addAttribute("userName",usuario );
		return "juego";
	}
	/*
	@RequestMapping(value = "/startmenu", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		model.addAttribute("userName", request.getRemoteAddr());
		return "startmenu";
	}
	*/
}


