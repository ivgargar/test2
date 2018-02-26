package com.mycorp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.mycorp.support.DatosCliente;
import com.mycorp.support.MensajeriaService;

import junit.framework.TestCase;
import util.datos.UsuarioAlta;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class RealizarSimulacionTest extends TestCase {
	
    @Value("#{envPC['zendesk.ticket']}")
    public String PETICION_ZENDESK= "";

    @Value("#{envPC['zendesk.token']}")
    public String TOKEN_ZENDESK= "";

    @Value("#{envPC['zendesk.url']}")
    public String URL_ZENDESK= "";

    @Value("#{envPC['zendesk.user']}")
    public String ZENDESK_USER= "";

    @Value("#{envPC['tarjetas.getDatos']}")
    public String TARJETAS_GETDATOS = "";

    @Value("#{envPC['cliente.getDatos']}")
    public String CLIENTE_GETDATOS = "";

    @Value("#{envPC['zendesk.error.mail.funcionalidad']}")
    public String ZENDESK_ERROR_MAIL_FUNCIONALIDAD = "";

    @Value("#{envPC['zendesk.error.destinatario']}")
    public String ZENDESK_ERROR_DESTINATARIO = "";
	
	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private MensajeriaService emailService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@InjectMocks
	private ZendeskService zendeskService;

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue( true );
    }

    @Test
    public void testAltaTicketZendesk() {
    		zendeskService.PETICION_ZENDESK= PETICION_ZENDESK;

    		zendeskService.TOKEN_ZENDESK= TOKEN_ZENDESK;

    		zendeskService.URL_ZENDESK= URL_ZENDESK;

    		zendeskService.ZENDESK_USER= ZENDESK_USER;

    		zendeskService.TARJETAS_GETDATOS = TARJETAS_GETDATOS;

    		zendeskService.CLIENTE_GETDATOS = CLIENTE_GETDATOS;

    		zendeskService.ZENDESK_ERROR_MAIL_FUNCIONALIDAD = ZENDESK_ERROR_MAIL_FUNCIONALIDAD;

    		zendeskService.ZENDESK_ERROR_DESTINATARIO = ZENDESK_ERROR_DESTINATARIO;
    	
    		UsuarioAlta usuarioAlta = new UsuarioAlta();
    		usuarioAlta.setNumTarjeta("12345");
    		
    		String urlToRead = TARJETAS_GETDATOS + usuarioAlta.getNumTarjeta();
    		Mockito.when(restTemplate.getForEntity(urlToRead, String.class)).thenReturn(new ResponseEntity<String>("1", HttpStatus.OK));
    		
    		DatosCliente datosCliente = new DatosCliente();
    		datosCliente.setFechaNacimiento("12/12/1980"); //Setted for avoiding NPE
    		datosCliente.setGenCTipoDocumento(1); //Setted for avoiding NPE
    		datosCliente.setGenTTipoCliente(1); //Setted for avoiding NPE
    		Mockito.when(restTemplate.getForObject("http://localhost:8080/test-endpoint", DatosCliente.class, "1")).thenReturn(datosCliente);
    	
    		String result = zendeskService.altaTicketZendesk(usuarioAlta, "userAgent");
    		assertNotNull(result);
    }
    
    @Configuration
    static class Config {

        @Bean(name="envPC")
        public static PropertiesFactoryBean mapper() {
            PropertiesFactoryBean bean = new PropertiesFactoryBean();
            bean.setLocation(new ClassPathResource("envPC.properties"));
            return bean;
        }

    }
}
