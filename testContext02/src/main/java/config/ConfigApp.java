package config;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "main") //Specifica in quale package di base il context deve andare a ritrovare i bean
public class ConfigApp 
{
	@Bean
    String saluti()
    {
        return "Saluti da Spring Context";
    }
}
