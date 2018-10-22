import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SokhinCrossover extends AbstractCrossover<double[]> {
    protected SokhinCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        double tmp;
        double alpha = 1.0;
        double[] c1 = new double[p1.length];
        double[] c2 = new double[p1.length];
        int k = random.nextInt(p1.length);
        for (i = 0; i < k; i++){
            c1[i] = p1[i];
            c2[i] = p2[i];
        }
        for (i = k; i < p1.length; i++){
            tmp = p1[i];
            c1[i] = p1[i] * (1-alpha) + p2[i] * (alpha);
            c2[i] = p2[i] * (1-alpha) + tmp * (alpha);
        }

        // your implementation:
            children.add(c1);

            children.add(c2);

        return children;
    }
}
