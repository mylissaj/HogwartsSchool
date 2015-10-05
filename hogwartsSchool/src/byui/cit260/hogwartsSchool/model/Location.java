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
public class Location implements Serializable{
    
    private double row;
    private double column;
    private double visited;
    private double actor;
    private double notes;

    public Location() {
    }

    
    
    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }

    public double getActor() {
        return actor;
    }

    public void setActor(double actor) {
        this.actor = actor;
    }

    public double getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", actor=" + actor + ", notes=" + notes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.actor) ^ (Double.doubleToLongBits(this.actor) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.notes) ^ (Double.doubleToLongBits(this.notes) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actor) != Double.doubleToLongBits(other.actor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.notes) != Double.doubleToLongBits(other.notes)) {
            return false;
        }
        return true;
    }
    
    
}
