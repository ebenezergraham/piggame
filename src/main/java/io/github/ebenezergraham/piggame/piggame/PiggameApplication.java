package io.github.ebenezergraham.piggame.piggame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("io.github.ebenezergraham.piggame.piggame.repository")
@EntityScan("io.github.ebenezergraham.piggame.piggame.repository")
@SpringBootApplication
public class PiggameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiggameApplication.class, args);
	}
}
