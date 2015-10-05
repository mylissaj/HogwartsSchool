/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.model;

/**
 *
 * @author mylis_000
 */
public class InformationScene implements Serializable{
    
    private double description;
    private double interacation;

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getInteracation() {
        return interacation;
    }

    public void setInteracation(double interacation) {
        this.interacation = interacation;
    }

    public InformationScene() {
    }

    @Override
    public String toString() {
        return "InformationScene{" + "description=" + description + ", interacation=" + interacation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.interacation) ^ (Double.doubleToLongBits(this.interacation) >>> 32));
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
        final InformationScene other = (InformationScene) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interacation) != Double.doubleToLongBits(other.interacation)) {
            return false;
        }
        return true;
    }
    
    
    
}
