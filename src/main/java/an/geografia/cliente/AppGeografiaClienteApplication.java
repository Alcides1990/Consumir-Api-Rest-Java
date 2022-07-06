package an.geografia.cliente;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.json.JsonReadContext;

@SpringBootApplication
public class AppGeografiaClienteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppGeografiaClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String endPoint="https://appgeografiaparaguay.herokuapp.com/api/listarTodoDepartamento";
		RestTemplate res= new RestTemplate();
		Object[] departamento= res.getForObject(endPoint, Object[].class);
		for (Object o : departamento) {
			System.out.println(o.toString());
		}
	}

}
