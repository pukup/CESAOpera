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
public class Odd extends Heliostat{
    
    public Odd(Heliostat heliostat) {
        super(heliostat);
    }

    public Odd(Variables variables) {
        super(variables);
    }

    @Override
    public Type getType() {
        return Type.Pair;
    }
    
}
