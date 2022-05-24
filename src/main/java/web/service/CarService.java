package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarService {
    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        carList.add(new Car("Nissan", "white", 111));
        carList.add(new Car("Opel", "blue", 222));
        carList.add(new Car("Kia", "yellow", 333));
        carList.add(new Car("Toyota", "black", 444));
        carList.add(new Car("Audi", "grey", 555));
        return carList;
    }

    public List<Car> getCarCount(Integer count) {
        if (count == null || count >= 5) {
            return getCarList();
        } else {
            return getCarList().subList(0, count);
        }
    }
}
