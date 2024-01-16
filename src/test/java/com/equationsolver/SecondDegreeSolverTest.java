package com.equationsolver;

import org.junit.Assert;
import org.junit.Test;

import com.equationsolver.services.ISecondegreeSolver;
import com.equationsolver.services.implementation.ISecondDegreeSolverImpl;

public class SecondDegreeSolverTest {
    ISecondegreeSolver SecondDegreeSolver = new ISecondDegreeSolverImpl();
    @Test
    public void testSolveEquation() {
        // Test case 1: a = 1, b = -3, c = 2
        double a1 = 1;
        double b1 = -3;
        double c1 = 2;
        double[] expectedRoots1 = {1.0, 2.0};
        double[] actualRoots1 = SecondDegreeSolver.solve(a1, b1, c1);
        Assert.assertArrayEquals(expectedRoots1, actualRoots1, 0.0001);

        // Test case 2: a = 2, b = 4, c = 2
        double a2 = 2;
        double b2 = 4;
        double c2 = 2;
        double[] expectedRoots2 = {-1.0};
        double[] actualRoots2 = SecondDegreeSolver.solve(a2, b2, c2);
        Assert.assertArrayEquals(expectedRoots2, actualRoots2, 0.0001);

        // Test case 3: a = 1, b = -2, c = 1
        double a3 = 1;
        double b3 = -2;
        double c3 = 1;
        double[] expectedRoots3 = {1.0};
        double[] actualRoots3 = SecondDegreeSolver.solve(a3, b3, c3);
        Assert.assertArrayEquals(expectedRoots3, actualRoots3, 0.0001);
    }
}
