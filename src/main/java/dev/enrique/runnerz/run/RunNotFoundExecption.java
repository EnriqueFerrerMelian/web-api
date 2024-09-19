package dev.enrique.runnerz.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.NOT_FOUND)
public class RunNotFoundExecption extends RuntimeException{
    public RunNotFoundExecption(){
        super("Run not found");
    }
}
