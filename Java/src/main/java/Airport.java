import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import java.util.*;

public class Airport<T extends Plane> {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<T> getPlanesOfCategory(Class<? extends Plane> aClass) {
        List<T> planesOfCategory = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getClass().equals(aClass)) {
                planesOfCategory.add((T) plane);
            }
        }
        return planesOfCategory;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = (List<PassengerPlane>) getPlanesOfCategory(PassengerPlane.class);
        Collections.sort(passengerPlanes, PassengerPlane.getPassengerCapacityComparator());
        return passengerPlanes.get(passengerPlanes.size()-1);
    }

    public List<MilitaryPlane> getMilitaryPlanesByType(MilitaryType type){
        List<MilitaryPlane> militaryPlanesByType = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = (List<MilitaryPlane>) getPlanesOfCategory(MilitaryPlane.class);
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getMilitaryType().equals(type)) {
                militaryPlanesByType.add(militaryPlanes.get(i));
            }
        }
        return militaryPlanesByType;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, Plane.getMaxFlightDistanceComparator());
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, Plane.getMaxSpeedComparator());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, Plane.getMaxLoadCapacityComparator());
        return this;
    }
    
    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}
