package com.quantitymeasurementapi.service;

import com.quantitymeasurementapi.controller.QuantityMeasurementController;
import com.quantitymeasurementapi.exception.QuantityMeasurementException;
import com.quantitymeasurementapi.model.QuantityMeasurementModel;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class QuantityMeasurementServiceTest {

    private UnitType mockUnitType;
    QuantityMeasurement quantityMeasurement2;
    QuantityMeasurement quantityMeasurement;
    QuantityMeasurementModel measurementMode;

    @BeforeEach
    void setUp() {
        mockUnitType = mock(UnitType.class);
        quantityMeasurement = mock(QuantityMeasurement.class);
        measurementMode = new QuantityMeasurementModel(1.0, 1.0, "FEET", "FEET");
    }

    @Test
    public void givenOneYardAndOneYard_WhenCompareMethodMock_ShouldReturnTrue() {
        try {
            QuantityMeasurementService quantityMeasurementService = new QuantityMeasurementService();
            quantityMeasurementService.setUnitType(mockUnitType);
            when(mockUnitType.getUnitValueType("FEET")).thenReturn(UnitOfWeights.TONNE);
            when(quantityMeasurement.compare(quantityMeasurement2)).thenReturn(true);
            boolean isTrue = quantityMeasurementService.compare(measurementMode);
            Assert.assertTrue(isTrue);
        } catch (QuantityMeasurementException e) {
        }
    }


    @Test
    public void givenOneFeet_WhenPassOneFeet_ShouldReturnUnitTypeWithValue() {
        try {
            QuantityMeasurementService quantityMeasurementService = new QuantityMeasurementService();
            quantityMeasurementService.setUnitType(mockUnitType);
            when(mockUnitType.getUnitValueType("FEET")).thenReturn(UnitOfWeights.TONNE);
            when(quantityMeasurement.compare(quantityMeasurement2)).thenReturn(true);
            boolean isTrue = quantityMeasurementService.compare(measurementMode);
            Assert.assertTrue(isTrue);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    void addTwoUnit() {
    }
}