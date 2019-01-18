/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CESAOpera.mvc.model.heliostat;

import CESAOpera.mvc.model.heliostat.variables.Variables;

/**
 *
 * @author lol
 */
public class Pair extends Heliostat{

    public Pair(Heliostat heliostat) {
        super(heliostat);
    }
    
    public Pair(Variables variables){
        super(variables);
    }

    @Override
    public Type getType() {
        return Type.Pair;
    }

}
