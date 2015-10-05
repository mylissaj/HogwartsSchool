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
public class Game implements Serializable{
    
    private double notes;
    private double totalPoints;

    public double getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes = notes;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "notes=" + notes + ", totalPoints=" + totalPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.notes) ^ (Double.doubleToLongBits(this.notes) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.totalPoints) ^ (Double.doubleToLongBits(this.totalPoints) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.notes) != Double.doubleToLongBits(other.notes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalPoints) != Double.doubleToLongBits(other.totalPoints)) {
            return false;
        }
        return true;
    }

    
    
}
