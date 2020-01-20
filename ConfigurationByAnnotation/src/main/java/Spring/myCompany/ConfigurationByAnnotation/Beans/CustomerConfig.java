package Spring.myCompany.ConfigurationByAnnotation.Beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages ="Spring.myCompany.ConfigurationByAnnotation.Beans" )
public class CustomerConfig {

}
