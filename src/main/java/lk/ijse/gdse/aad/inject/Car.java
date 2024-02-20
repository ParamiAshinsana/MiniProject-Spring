package lk.ijse.gdse.aad.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    @Autowired
    public Car(Engine engine){
        this.engine= engine;
    }
    // setter inj
    // immutable and mutable
    public String run(){
        return engine.v12();
    }
}
