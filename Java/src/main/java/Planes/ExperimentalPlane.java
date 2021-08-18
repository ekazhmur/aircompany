package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;
import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public ExperimentalTypes getExperimentalType() { return experimentalType; }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!=obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ExperimentalPlane plane = (ExperimentalPlane) obj;
        return experimentalType == plane.experimentalType && classificationLevel==plane.classificationLevel;
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), experimentalType, classificationLevel); }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
