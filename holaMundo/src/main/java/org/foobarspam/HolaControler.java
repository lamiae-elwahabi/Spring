package org.foobarspam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaControler {
	//Metodo
	@RequestMapping(path="/")
	@ResponseBody
	public String saludo() {
		return "Hola mundo!";
	}

}
