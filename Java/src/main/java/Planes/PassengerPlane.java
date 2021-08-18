package Planes;

import java.util.Comparator;
import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        PassengerPlane plane = (PassengerPlane) obj;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }

    public static Comparator<PassengerPlane> getPassengerCapacityComparator(){
        return new Comparator<PassengerPlane>() {
            @Override
            public int compare(PassengerPlane o1, PassengerPlane o2) {
                return o1.getPassengersCapacity()-o2.getPassengersCapacity();
            }
        };
    }
}
