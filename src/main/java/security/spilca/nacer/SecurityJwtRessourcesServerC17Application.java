package security.spilca.nacer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityJwtRessourcesServerC17Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SecurityJwtRessourcesServerC17Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ressource server started.....");
	}

}
