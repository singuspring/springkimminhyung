// use/Call.java  (main 이 있는 실행 파일)
package use;

import used.AddCalc;
import used.Calculator;
import used.SubCalc;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println("계산 결과는 " + result + "입니다.");
    }
}
