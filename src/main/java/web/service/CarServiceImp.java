package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Nissan", "white", 111));
        carList.add(new Car("Opel", "blue", 222));
        carList.add(new Car("Kia", "yellow", 333));
        carList.add(new Car("Toyota", "black", 444));
        carList.add(new Car("Audi", "grey", 555));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCountCar(Integer count) {
        if (count == null || count >= 5) {
            return getCarList();
        } else {
            return getCarList().subList(0, count);
        }
    }
}
