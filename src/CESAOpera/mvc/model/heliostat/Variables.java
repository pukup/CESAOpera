/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CESAOpera.mvc.model.heliostat;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lol
 */
public class Variables implements Serializable {
    
    private final static long SerialVersionUID = 1L;
    private int numHeliostat, numHeliostatGroup, comLine, jetlag, serialPort;
    private Point coordinates;
    private Date date;
    private boolean emergencyLine;
    
    
    public Variables(int numHeliostat, int numHeliostatGroup, int comLine, Point coordinates, boolean emergencyLine){
        this.numHeliostat = getNumHeliostat();
        this.numHeliostatGroup = getNumHeliostatGroup();
        this.comLine = getComLine();
        this.coordinates = getCoordinates();
        this.emergencyLine = isEmergencyLine();
    }

    /**
     * @return the numHeliostat
     */
    public int getNumHeliostat() {
        return numHeliostat;
    }

    /**
     * @param numHeliostat the numHeliostat to set
     */
    public void setNumHeliostat(int numHeliostat) {
        this.numHeliostat = numHeliostat;
    }

    /**
     * @return the numHeliostatGroup
     */
    public int getNumHeliostatGroup() {
        return numHeliostatGroup;
    }

    /**
     * @param numHeliostatGroup the numHeliostatGroup to set
     */
    public void setNumHeliostatGroup(int numHeliostatGroup) {
        this.numHeliostatGroup = numHeliostatGroup;
    }

    /**
     * @return the comLine
     */
    public int getComLine() {
        return comLine;
    }

    /**
     * @param comLine the comLine to set
     */
    public void setComLine(int comLine) {
        this.comLine = comLine;
    }

    /**
     * @return the jet lag
     */
    public int getJetlag() {
        return jetlag;
    }

    /**
     * @param jetlag the jet lag to set
     */
    public void setJetlag(int jetlag) {
        this.jetlag = jetlag;
    }

    /**
     * @return the serialPort
     */
    public int getSerialPort() {
        return serialPort;
    }

    /**
     * @param serialPort the serialPort to set
     */
    public void setSerialPort(int serialPort) {
        this.serialPort = serialPort;
    }

    /**
     * @return the coordinates
     */
    public Point getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates the coordinates to set
     */
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the emergencyLine
     */
    public boolean isEmergencyLine() {
        return emergencyLine;
    }

    /**
     * @param emergencyLine the emergencyLine to set
     */
    public void setEmergencyLine(boolean emergencyLine) {
        this.emergencyLine = emergencyLine;
    }
}
