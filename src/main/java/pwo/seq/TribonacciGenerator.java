/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    public TribonacciGenerator() {
        f_3 = BigDecimal.ZERO;
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else {
            current = BigDecimal.valueOf(lastIndex == 2 ? 1 : 0);
        }
        lastIndex++;
        return current;
    }
}