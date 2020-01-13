package com.quantitymeasurementapi.controller;

import com.quantitymeasurementapi.exception.QuantityMeasurementException;
import com.quantitymeasurementapi.model.QuantityMeasurementModel;
import com.quantitymeasurementapi.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measurement")
public class QuantityMeasurementController {

    @Autowired
    QuantityMeasurementService measurementService;

    @GetMapping("/get")
    public boolean compare(@RequestBody QuantityMeasurementModel quantityMeasurementModel) throws QuantityMeasurementException {
        return measurementService.compare(quantityMeasurementModel);
    }

    @GetMapping("/addUnits")
    public Double addTwoUnit(@RequestBody QuantityMeasurementModel quantityMeasurementModel) throws QuantityMeasurementException {
        return this.measurementService.addTwoUnit(quantityMeasurementModel);
    }

    public void setMeasurementService(QuantityMeasurementService measurementServices) {
        measurementService =measurementServices;
    }
}
