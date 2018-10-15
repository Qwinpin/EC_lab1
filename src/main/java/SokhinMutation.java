import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class SokhinMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        double mutation_rate = 0.5;
        int index;
        for (int i = 0; i < population.size(); i++){
            if (random.nextDouble() < mutation_rate){
                for (int j = 0; j < population.get(0).length; j++){
                    if (random.nextDouble() >= 0.2){
                        index = random.nextInt(population.get(0).length);
                        population.get(i)[j] += random.nextGaussian()*0.05;
                        population.get(i)[j] %= 5.0;
                    }else{
                        index = random.nextInt(population.get(0).length);
                        population.get(i)[j] -= random.nextGaussian()*0.05;
                        population.get(i)[j] %= 5.0;
                    }
                    }
            }
        }

        //result population
        return population;
    }
}
