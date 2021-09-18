package hu.iit.uni.miskolc.advanced.java.service;

import org.springframework.stereotype.Service;

@Service
public class QuadraticSolverImpl implements QuadraticSolver {

    @Override
    public double[] solve(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return new double[0];
        }
        if (discriminant == 0.0) {
            return new double[] {(-1 * b) / (2 * a)};
        }
        return new double[] {
            (-1 * b + Math.sqrt(discriminant)) / (2 * a),
            (-1 * b - Math.sqrt(discriminant)) / (2 * a)
        };
    }
}
