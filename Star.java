package SpaceGame;

import java.util.List;

public class Star extends OrbitableSpaceObject{
    public Star(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void addOrbiter(SpaceObject orbiter) {
        super.addOrbiter(orbiter);
    }

    @Override
    public List<SpaceObject> getOrbiters() {
        return super.getOrbiters();
    }
}
