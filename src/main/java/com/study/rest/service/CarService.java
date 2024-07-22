package com.study.rest.service;

import com.study.rest.entity.Car;
import com.study.rest.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    // final -> 상수: 무조건 한번은 초기화를 해줘야 한다. @Autowired 대신 쓸 수 있는 방법
    // 강제성
    private final CarRepository carRepository;

    public Car getCar(String model) {
        return carRepository.findCarByModel(model);
    }
}
