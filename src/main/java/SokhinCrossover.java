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
        double alpha = 0.2;
        double[] p3 = p1;
        double[] p4 = p2;

        int k = random.nextInt(p1.length);
        for (i = k; i < p1.length; i++){
            tmp = p1[i];
            p1[i] = p1[i] * alpha + p2[i] * (1 - alpha);
            p2[i] = p2[i] * alpha + tmp * (1 - alpha);
        }
        // your implementation:
        if (random.nextDouble() > 0.4){
            children.add(p1);
        } else{
            children.add(p3);
        }
        if (random.nextDouble() > 0.4){
            children.add(p2);
        } else{
            children.add(p4);
        }
        return children;
    }
}
