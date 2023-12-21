package br.com.cotiinformatica.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	@Bean //método para configurar a injeção de dependencia do automapper 
	public ModelMapper getModelMapper() { 
		
		ModelMapper modelMapper = new ModelMapper();
		
		// Config para comparação entre DTO e entidade. 
		// A entidade tinha IdProduto o Dto não. 
		// O STRICT somente compara o que for estritamente Igual o resto ignora. No caso ignorou o IdProduto 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); 
		
		return modelMapper;
		
	}
	
}
