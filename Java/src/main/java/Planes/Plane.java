package Planes;

import java.util.Comparator;
import java.util.Objects;

abstract public class Plane {
    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() { return this.maxLoadCapacity; }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null || obj.getClass()!=this.getClass()) return false;
        Plane plane = (Plane) obj;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() { return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity); }

    public static Comparator<Plane> getMaxSpeedComparator(){
        return new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed()-o2.getMaxSpeed();
            }
        };
    }

    public static Comparator<Plane> getMaxFlightDistanceComparator(){
        return new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxFlightDistance()-o2.getMaxFlightDistance();
            }
        };
    }

    public static Comparator<Plane> getMaxLoadCapacityComparator(){
        return new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity()-o2.getMaxLoadCapacity();
            }
        };
    }
}
