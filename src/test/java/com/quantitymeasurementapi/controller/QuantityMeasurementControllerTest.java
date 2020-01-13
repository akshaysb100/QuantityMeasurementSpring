package com.quantitymeasurementapi.controller;

import com.quantitymeasurementapi.exception.QuantityMeasurementException;
import com.quantitymeasurementapi.model.QuantityMeasurementModel;
import com.quantitymeasurementapi.service.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class QuantityMeasurementControllerTest {

    private QuantityMeasurementService measurementService;
    QuantityMeasurementModel measurementMode1;

    @BeforeEach
    void setUp() {
        measurementService = mock(QuantityMeasurementService.class);
        measurementMode1 = new QuantityMeasurementModel(1.0, 1.0, "FEET", "FEET");
    }

    @Test
    public void givenOneYardAndOneYard_WhenCompareMethodMock_ShouldReturnTrue() {
        try {
            QuantityMeasurementController measurementController = new QuantityMeasurementController();
            measurementController.setMeasurementService(measurementService);
            when(measurementService.compare(measurementMode1)).thenReturn(true);
            boolean compare = measurementController.compare(measurementMode1);
            Assert.assertTrue(compare);

        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenOneTonneAnd1000Gram_WhenAddMethodMock_ShouldReturn1001Kilogram() {
        try {
            QuantityMeasurementController measurementController = new QuantityMeasurementController();
            measurementController.setMeasurementService(measurementService);
            when(measurementService.addTwoUnit(measurementMode1)).thenReturn(2.0);
            Double addTwoUnit  = measurementController.addTwoUnit(measurementMode1);
            Assert.assertEquals(2.0,addTwoUnit,0.0);
        } catch (QuantityMeasurementException e) {
        }
    }

    @Test
    public void givenOneFeet_WhenPass_ShouldReturnUnitTypeWithValue() {
        try {
         //   when(mockUnitType.getUnitValueType("TONNE")).thenReturn(UnitOfWeights.TONNE);
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, UnitOfWeights.TONNE);
           // when(mockUnitType.getUnitValueType("GRAM")).thenReturn(UnitOfWeights.GRAM);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1000.0, UnitOfWeights.GRAM);
        //    when(quantityMeasurement.additionOfTwoUnits(quantityMeasurement2)).thenReturn(1001.0);
            Double additionOfInchAndInch = quantityMeasurement1.additionOfTwoUnits(quantityMeasurement2);
            Assert.assertEquals(1001.0, additionOfInchAndInch, 0.0);
        } catch (QuantityMeasurementException e) {
        }
    }
}