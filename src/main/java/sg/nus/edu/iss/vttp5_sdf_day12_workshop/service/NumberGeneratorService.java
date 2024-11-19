package sg.nus.edu.iss.vttp5_sdf_day12_workshop.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.edu.iss.vttp5_sdf_day12_workshop.repo.NumberGeneratorRepo;

@Service
public class NumberGeneratorService {
    @Autowired
    NumberGeneratorRepo numberGeneratorRepo;

    public List<String> getNumbers(int numsToGenerate) throws IOException{
        return numberGeneratorRepo.getNumbers(numsToGenerate);
    }
}
