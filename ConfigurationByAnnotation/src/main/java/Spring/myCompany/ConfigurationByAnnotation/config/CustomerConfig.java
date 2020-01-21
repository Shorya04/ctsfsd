package Spring.myCompany.ConfigurationByAnnotation.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages ="Spring.myCompany.ConfigurationByAnnotation.Beans" )
public class CustomerConfig {

	@Bean
	private DataSource dataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/db2", "root", "welcome");
	}
	
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
}
