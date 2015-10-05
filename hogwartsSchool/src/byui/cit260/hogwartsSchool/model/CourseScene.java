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
public class CourseScene implements Serializable{
    
    private double description;
    private double instructions;
    private double task;

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public double getInstructions() {
        return instructions;
    }

    public void setInstructions(double instructions) {
        this.instructions = instructions;
    }

    public double getTask() {
        return task;
    }

    public void setTask(double task) {
        this.task = task;
    }

    public CourseScene() {
    }

    @Override
    public String toString() {
        return "CourseScene{" + "description=" + description + ", instructions=" + instructions + ", task=" + task + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.instructions) ^ (Double.doubleToLongBits(this.instructions) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.task) ^ (Double.doubleToLongBits(this.task) >>> 32));
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
        final CourseScene other = (CourseScene) obj;
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.instructions) != Double.doubleToLongBits(other.instructions)) {
            return false;
        }
        if (Double.doubleToLongBits(this.task) != Double.doubleToLongBits(other.task)) {
            return false;
        }
        return true;
    }
    
}
