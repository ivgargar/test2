package com.mycorp;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;

import com.mycorp.ejb.PortalClientesWebEJBRemoteBean;

import portalclientesweb.ejb.interfaces.PortalClientesWebEJBRemote;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @Bean(name="envPC")
    public static PropertiesFactoryBean mapper() {
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(new ClassPathResource("envPC.properties"));
        return bean;
    }
    
    @Bean
    public PortalClientesWebEJBRemote portalclientesWebEJBRemote() {
    		return new PortalClientesWebEJBRemoteBean();
    }
    
	@Bean
	public RestTemplate restTemplateUTF8(RestTemplateBuilder builder) {
		return builder.build();
	}
}
