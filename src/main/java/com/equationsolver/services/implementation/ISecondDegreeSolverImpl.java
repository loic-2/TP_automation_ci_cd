package com.equationsolver.services.implementation;

import com.equationsolver.services.ISecondegreeSolver;

public class ISecondDegreeSolverImpl implements ISecondegreeSolver {
    public double[] solve(double a, double b, double c) {
        double[] result;
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            result = new double[1];
            result[0] = 0;
        } else if (delta == 0) {
            result = new double[1];
            result[0] = -b / (2 * a);
        } else {
            result = new double[2];
            result[0] = (-b + Math.sqrt(delta)) / (2 * a);
            result[1] = (-b - Math.sqrt(delta)) / (2 * a);
        }
        return result;
    }
}
