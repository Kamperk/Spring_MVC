package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(313,1,"Lada"));
        cars.add(new Car(41,2,"Ford"));
        cars.add(new Car(3123,3,"Nissan"));
        cars.add(new Car(3432,4,"Infinity"));
        cars.add(new Car(4313,5,"Lexus"));
    }
    public List<Car> getCar(){
        return cars;
    }
}
