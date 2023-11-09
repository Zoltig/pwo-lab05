/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    public LucasGenerator() {
        reset();
    }

    @Override
    public void reset() {
        super.reset();
        current = BigDecimal.valueOf(2);
        f_2 = BigDecimal.valueOf(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return BigDecimal.valueOf(2);
        }
        return super.nextTerm();
    }
}