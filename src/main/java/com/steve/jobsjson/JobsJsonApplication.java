package com.steve.jobsjson;

import com.google.common.collect.Sets;
import com.steve.jobsjson.config.SwaggerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.StandardServletEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;

@SpringBootApplication
@RestController
public class JobsJsonApplication implements CommandLineRunner{

	private static final Logger LOGGER = LoggerFactory.getLogger(JobsJsonApplication.class);

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication springApplication = new SpringApplication(JobsJsonApplication.class);
		profiles(springApplication.run(args).getEnvironment());
	}

	@Autowired
	private SwaggerConfig swaggerConfig;

	public static void profiles(Environment environment) throws UnknownHostException {
		String protocol = "http";
		if (environment.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}

		Collection<String> applicationConfigs = Sets.newHashSet();

		LOGGER.info("\n----------------------------------------------------------\n\tEcloudApplication '{}' is running! Access URLs:\n\tLocal: \t\t{}://localhost:{}\n\tExternal: \t{}://{}:{}\n\tConfig(s): \t{}\n----------------------------------------------------------", new Object[]{environment.getProperty("spring.application.name"), protocol, environment.getProperty("server.port"), protocol, InetAddress.getLocalHost().getHostAddress(), environment.getProperty("server.port"), applicationConfigs});
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(swaggerConfig.createRestApi());
	}

}
