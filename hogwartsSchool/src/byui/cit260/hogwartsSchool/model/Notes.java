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
public class Notes implements Serializable{
    
    private double informationList;

    public double getInformationList() {
        return informationList;
    }

    public void setInformationList(double informationList) {
        this.informationList = informationList;
    }

    public Notes() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.informationList) ^ (Double.doubleToLongBits(this.informationList) >>> 32));
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
        final Notes other = (Notes) obj;
        if (Double.doubleToLongBits(this.informationList) != Double.doubleToLongBits(other.informationList)) {
            return false;
        }
        return true;
    
    
    }
    
}
