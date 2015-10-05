/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.model;

import java.util.Objects;

/**
 *
 * @author mylis_000
 */
public class Player implements Serializable{
    
    private String name;
    private double house;
    private double points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHouse() {
        return house;
    }

    public void setHouse(double house) {
        this.house = house;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", house=" + house + ", points=" + points + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.house) ^ (Double.doubleToLongBits(this.house) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.points) ^ (Double.doubleToLongBits(this.points) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.house) != Double.doubleToLongBits(other.house)) {
            return false;
        }
        if (Double.doubleToLongBits(this.points) != Double.doubleToLongBits(other.points)) {
            return false;
        }
        return true;
    }
    
    
    
}
