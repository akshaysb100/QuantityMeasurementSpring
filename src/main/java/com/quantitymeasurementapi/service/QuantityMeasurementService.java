package com.quantitymeasurementapi.service;

import com.quantitymeasurementapi.exception.QuantityMeasurementException;
import com.quantitymeasurementapi.model.QuantityMeasurementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementService {

    @Autowired
    UnitType unitType;

    public boolean compare(QuantityMeasurementModel quantityMeasurementModel) throws QuantityMeasurementException {
        Unit unitType1 = unitType.getUnitValueType(quantityMeasurementModel.getUnitType1());
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(quantityMeasurementModel.getUnitValue1(), unitType1);
        Unit unitType2 = unitType.getUnitValueType(quantityMeasurementModel.getUnitType2());
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(quantityMeasurementModel.getUnitValue2(), unitType2);
        return quantityMeasurement.compare(quantityMeasurement1);
    }

    public Double addTwoUnit(QuantityMeasurementModel quantityMeasurementModel) throws QuantityMeasurementException {
        Unit unitType1 = unitType.getUnitValueType(quantityMeasurementModel.getUnitType1());
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(quantityMeasurementModel.getUnitValue1(), unitType1);
        Unit unitType2 = unitType.getUnitValueType(quantityMeasurementModel.getUnitType2());
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(quantityMeasurementModel.getUnitValue2(), unitType2);
        return quantityMeasurement.additionOfTwoUnits(quantityMeasurement1);
    }

    public void setUnitType(UnitType unitTypes) {
        unitType = unitTypes;
    }
}
