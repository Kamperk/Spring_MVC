package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;
@Component
public class CarService {

    @Autowired
    CarDao carDao;

    public List<Car> getCar(int count){
        return carDao.getCar(count);
    }
}
