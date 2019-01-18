/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CESAOpera.mvc.model;

/**
 *
 * @author lol
 */
public class Focus {
    private int x, y, z;
    
    public Focus(int x, int y, int z){
        this.x = getX();
        this.y = getY();
        this.z = getZ();
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
}
