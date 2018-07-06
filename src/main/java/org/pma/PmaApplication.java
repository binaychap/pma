package org.pma;

import java.util.Arrays;

import org.pma.config.CustomUserDetails;
import org.pma.domain.Role;
import org.pma.domain.User;
import org.pma.repository.UserRepository;
import org.pma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
public class PmaApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;


	
	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}
	
	
	/**
	 * Password grants are switched on by injecting an AuthenticationManager.
	 * Here, we setup the builder so that the userDetailsService is the one we coded.
	 * @param builder
	 * @param repository
	 * @throws Exception
     */
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository, UserService service) throws Exception {
		//Setup a default user if db is empty
		if (repository.count()==0)
		service.save(new User ("user", "user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
		builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
	}

	/**
	 * We return an istance of our CustomUserDetails.
	 * @param repository
	 * @return
     */
	private UserDetailsService userDetailsService(final UserRepository repository) {
		return username -> new CustomUserDetails(repository.findByUsername(username));
	}
}



//
//@SpringBootApplication
//public class PmaApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(PmaApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(PmaApplication.class, args);
//	}
//}
