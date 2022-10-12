package org.example.interfaces.example1;

public interface Bird extends Animal, Flying {
    
    static final float DEAFAULT_WINGSPAN = 0.7f;
    default float getWingspan(){
        return Bird.DEAFAULT_WINGSPAN;
    }
}
