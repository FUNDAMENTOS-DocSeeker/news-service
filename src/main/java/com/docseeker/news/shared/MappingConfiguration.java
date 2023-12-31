package com.docseeker.news.shared;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {
    @Bean
    public EnhacedModelMapper modelMapper() {
        return new EnhacedModelMapper();
    }
}
