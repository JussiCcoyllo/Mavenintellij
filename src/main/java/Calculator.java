import exception.DivideByZeroException;
import exception.InfinityException;
import exception.NotANumberException;

import java.util.function.BiConsumer;

public class Calculator {
    private static final BiConsumer<Double, Double> NaNCheck = (a, b) -> {
        if(Double.isNaN(a) || Double.isNaN(b)){
            throw new NotANumberException("You cannot use NaN to do math.");
        }
    };

    private static final BiConsumer<Double, Double> FinCheck = (a, b) ->{
        if(Double.isInfinite(a) || Double.isInfinite(b)){
            throw new InfinityException("You cannot use an infinite number.");
        }
    };

    public static double sum(double a, double b){
        NaNCheck.accept(a, b);
        FinCheck.accept(a, b);
        return a + b;
    }
    public static double subs(double a, double b){
        NaNCheck.accept(a, b);
        FinCheck.accept(a, b);
        return a - b;
    }
    public static double mult(double a, double b){
        NaNCheck.accept(a, b);
        FinCheck.accept(a, b);
        return a * b;
    }
    public static double divide(double a, double b){
        NaNCheck.accept(a, b);
        FinCheck.accept(a, b);
        if(b == 0.00){
            throw new DivideByZeroException("Cannot divide by 0");
        }
        return a / b;
    }
     public static double power(double a, double b){
        NaNCheck.accept(a, b);
        FinCheck.accept(a, b);
        return Math.pow(a, b);
    }

}
