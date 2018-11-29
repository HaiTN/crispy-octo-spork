package com.nba.draft.drafttool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaRepositories(includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = JpaRepository.class))
//@EnableElasticsearchRepositories(includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = ElasticsearchRepository.class))
@SpringBootApplication
public class DraftToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DraftToolApplication.class, args);
	}
}
