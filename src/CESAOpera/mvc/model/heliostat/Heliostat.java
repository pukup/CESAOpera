/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CESAOpera.mvc.model.heliostat;

import CESAOpera.mvc.model.heliostat.variables.Variables;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author x
 */
public abstract class Heliostat implements Serializable
{    
    private static long SerialVersionUID = 1L;
    private Variables variables;
    public abstract Type getType();
    
    public Heliostat(Variables variables){
        setVariables(variables);
    }   
    
    public Heliostat(Heliostat heliostat){
        setVariables(getVariables());
    }

    /**
     * @return the variables
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * @param variables the variables to set
     */
    public void setVariables(Variables variables) {
        this.variables = variables;
    }
    
}
