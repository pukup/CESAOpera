/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CESAOpera.mvc.model.heliostat.variables;

import java.io.Serializable;

/**
 *
 * @author lol
 */
public class Polling implements Serializable {
    private final static long SerialVersionUID = 1L;
    private int estado, eventos, diagnosticoAZ, diagnosticoEL, posicionAZ, posicionEL, consignaAZ, consignaEL;
    private float cenitalSolar, azimutSolar, correcionRefraccion, horaCalculoSolar;
}
