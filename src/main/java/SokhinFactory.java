import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class SokhinFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public SokhinFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        for (int i = 0; i < dimension; i++){
            solution[i] = 1.0 + (1.0 + 1.0) * random.nextDouble();
        }

        return solution;
    }
}
