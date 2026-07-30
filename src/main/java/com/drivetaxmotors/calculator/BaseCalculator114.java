package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Calculadora gerada automaticamente para a pipeline de impostos.
 * Esta calculadora aplica uma taxa fixa ao valor base do veículo
 * e representa um dos cálculos da etapa base.
 */
public class BaseCalculator114 extends AbstractBaseCalculator {
    public BaseCalculator114() {
        super("base-fee-114", "Base Fee 114", BigDecimal.valueOf(6.4), false);
    }
}
