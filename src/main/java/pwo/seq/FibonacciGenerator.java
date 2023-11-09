/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {

    public FibonacciGenerator() {
        reset();
    }

    @Override
    public void reset() {
        super.reset();
        current = BigDecimal.ZERO;
        f_1 = BigDecimal.ONE;
        f_2 = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else {
            current = BigDecimal.valueOf(lastIndex);
        }

        lastIndex++;
        return current;
    }
}