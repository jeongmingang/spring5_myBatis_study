package spring5_myBatis_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
@ComponentScan(basePackages = {
		"spring5_myBatis_study.mapper",
		"spring5_myBatis_study.service"})
public class ContextRoot {
	
}
