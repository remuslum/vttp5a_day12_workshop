package sg.nus.edu.iss.vttp5_sdf_day12_workshop.repo;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.nus.edu.iss.vttp5_sdf_day12_workshop.model.NumberGenerator;

@Repository
public class NumberGeneratorRepo {
    public List<String> getNumbers(int numsToGenerate) throws IOException{
        return new NumberGenerator(numsToGenerate).generateNums();
    }
}
