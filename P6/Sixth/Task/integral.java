package Sixth.Task;
/*
자바로 y = exp(x) 정적분을 구해보자
 */

class calcIntegral {
    private double START;
    private double END;
    private double DX = 0.01;

    public calcIntegral(double START, double END, double DX) {
        this.START = START;
        this.END = END;
        this.DX = DX;
    }

    public double calc() {
        double result = 0.0;

        for(double i = START; i<END; i=i+DX) {
            result += DX * Math.exp(i);
        }
        return result;
    }

    public double getSTART() {
        return START;
    }
    public double getEND() {
        return END;
    }
    public double getDX() {
        return DX;
    }
}

public class integral {
    final static double START = 1.0;
    final static double END = 3.0;
    final static double DX = 0.01;

    public static void main(String[] args) {
        calcIntegral ci = new calcIntegral(START, END, DX);
        System.out.println(ci.calc());
    }
}
