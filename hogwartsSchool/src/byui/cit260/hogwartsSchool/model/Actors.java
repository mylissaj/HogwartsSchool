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
public class Actors implements Serializable{
    
    private double name;
    private double description;
    private double note;

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Actors() {
    }

    @Override
    public String toString() {
        return "Actors{" + "name=" + name + ", description=" + description + ", note=" + note + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.name) ^ (Double.doubleToLongBits(this.name) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.note) ^ (Double.doubleToLongBits(this.note) >>> 32));
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
        final Actors other = (Actors) obj;
        if (Double.doubleToLongBits(this.name) != Double.doubleToLongBits(other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.note) != Double.doubleToLongBits(other.note)) {
            return false;
        }
        return true;
    }
    
    
}
