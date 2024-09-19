package dev.enrique.runnerz;

import org.springframework.stereotype.Component;

@Component
public class Welcomemessage {
    public String getWelcomeMessage(){
        return "Welcome message";
    }

}
