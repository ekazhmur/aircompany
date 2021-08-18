package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;
import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private SecrecyType secrecyType;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType type, SecrecyType secrecyTypel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = type;
        this.secrecyType = secrecyType;
    }

    public SecrecyType getSecrecyType(){
        return secrecyType;
    }

    public ExperimentalTypes getExperimentalType() { return experimentalType; }

    public void setSecrecyType(SecrecyType secrecyType){
        this.secrecyType = secrecyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!=obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ExperimentalPlane plane = (ExperimentalPlane) obj;
        return experimentalType == plane.experimentalType && secrecyType==plane.secrecyType;
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), experimentalType, secrecyType); }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
