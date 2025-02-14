/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plants;

/**
 *
 * @author macos
 */
public class Plant {
    private String name;
    private double eqDiameter;
    private double mass;
    private double semiMajorAxis;
    private double orbitalPerid;

    public Plant(String name, double eqDiameter, double mass, double semiMajorAxis, double orbitalPerid) {
        this.name = name;
        this.eqDiameter = eqDiameter;
        this.mass = mass;
        this.semiMajorAxis = semiMajorAxis;
        this.orbitalPerid = orbitalPerid;
    }

    public String getName() {
        return name;
    }

    public double getEqDiameter() {
        return eqDiameter;
    }

    public double getMass() {
        return mass;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getOrbitalPerid() {
        return orbitalPerid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEqDiameter(double eqDiameter) {
        this.eqDiameter = eqDiameter;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public void setOrbitalPerid(double orbitalPerid) {
        this.orbitalPerid = orbitalPerid;
    }

    @Override
    public String toString() {
        return "Plant: " + name + ", eqDiameter=" + eqDiameter + ", mass=" + mass + ", semiMajorAxis=" + semiMajorAxis + ", orbitalPerid=" + orbitalPerid ;
    }
    
}
