package com.hyc.product.config;

import com.hyc.product.dto.CategoryDto;
import com.hyc.product.entity.Category;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerBeanMapperConfigure {

    @Bean
    public DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(this.getBeanMappingBuilder());
        return mapper;
    }

    public BeanMappingBuilder getBeanMappingBuilder(){
        return new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(Category.class, CategoryDto.class)
                        .fields("id", "id");
            }
        };
    }

}
