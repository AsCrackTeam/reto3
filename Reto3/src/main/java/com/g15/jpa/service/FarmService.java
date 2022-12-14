package com.g15.jpa.service;

import com.g15.jpa.entity.Farm;
import com.g15.jpa.repository.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonat
 */
@Service
public class FarmService {
    @Autowired
    private FarmRepository farmRepository;
    
    public List<Farm> getFarmList(){
        return farmRepository.findAll();
    }
    
    public Farm getFarmById(Long id){
        return farmRepository.findById(id).get();
    }
    
    public Farm insertFarm(Farm farm){
        return farmRepository.save(farm);
    }
    
    public void deleteFarm(Long id){
       farmRepository.deleteById(id);               
    }
    
    public Farm updateFarm(Farm farm){
        //la farm existe
        if (farm.getId()!=null){
            //validamos si la farm existe
            Optional<Farm> opcional =  farmRepository.findById(farm.getId());
            
            //la farm no existe
            if (opcional.isEmpty()) return farm;
            //si la farm existe
            else{
               Farm farmDB = opcional.get();
               
               farmDB.setAddress(farm.getAddress());
               farmDB.setExtension(farm.getExtension());
               farmDB.setCategory(farm.getCategory());
               farmDB.setName(farm.getName());
               farmDB.setDescription(farm.getDescription());
               return farmRepository.save(farmDB);
            }
            
        }
        return farm;
    }
}
