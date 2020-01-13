package com.quantitymeasurementapi.model;

public class QuantityMeasurementModel {
    Double unitValue1;
    Double unitValue2;
    String unitType1;
    String unitType2;

    public QuantityMeasurementModel(Double unitValue1, Double unitValue2, String unitType1, String unitType2) {
        this.unitValue1 = unitValue1;
        this.unitValue2 = unitValue2;
        this.unitType1 = unitType1;
        this.unitType2 = unitType2;
    }

    public QuantityMeasurementModel() {
    }

    public Double getUnitValue1() {
        return unitValue1;
    }

    public Double getUnitValue2() {
        return unitValue2;
    }

    public String getUnitType1() {
        return unitType1;
    }

    public String getUnitType2() {
        return unitType2;
    }

    @Override
    public String toString() {
        return "QuantityMeasurementModel{" +
                "unit1=" + unitValue1 +
                ", unit2=" + unitValue2 +
                ", unitType1='" + unitType1 + '\'' +
                ", unitType2='" + unitType2 + '\'' +
                '}';
    }
}
