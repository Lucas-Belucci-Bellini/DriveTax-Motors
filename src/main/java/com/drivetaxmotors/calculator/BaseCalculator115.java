package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Calculadora gerada automaticamente para a pipeline de impostos.
 * Esta calculadora aplica uma taxa fixa ao valor base do veículo
 * e representa um dos cálculos da etapa base.
 */
public class BaseCalculator115 extends AbstractBaseCalculator {
    public BaseCalculator115() {
        super("base-fee-115", "Base Fee 115", BigDecimal.valueOf(6.5), false);
    }
}
