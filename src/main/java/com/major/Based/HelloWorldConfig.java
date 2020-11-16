package com.major.Based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
/*    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }*/
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
