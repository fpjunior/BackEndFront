package com.avaliacao.informata.springboot;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RestController
	@CrossOrigin
	@RequestMapping("avaliacao")
	public class AvaliacaoRestController {

		@GetMapping("dados")
		public List<Map<String, Object>> dadosAvaliacaoMock(){
			List<Map<String, Object>> lista = new ArrayList<>();
			
			Map<String, Object> mapXbox = new HashMap<>();
			mapXbox.put("id", 123456);
			mapXbox.put("nome", "Xbox One X");
			
			Map<String, Object> mapPS4 = new HashMap<>();
			mapPS4.put("id", 123456);
			mapPS4.put("nome", "PS4");
			
			lista.add(mapXbox);
			lista.add(mapPS4);
			
			return lista;						
		}

	}


}

