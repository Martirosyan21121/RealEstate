package am.realestate.realestate.services;

import am.realestate.realestate.model.Home;
import am.realestate.realestate.model.HomeType;
import am.realestate.realestate.repasitpres.HomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class HomeService {
    @Autowired
    private HomeRepository homeRepository;

    public List<Home> findAll() {
        return homeRepository.findAll();
    }

    public Optional<Home> findById(int id){
        return homeRepository.findById(id);
    }

    public Home save(Home home){
        Optional<Home> home1 = homeRepository.findByAddress(home.getAddress().toUpperCase(Locale.ROOT));
        if (home1.isPresent()){
            return home1.get();
        }
        home.setAddress(home.getAddress().toUpperCase(Locale.ROOT));

        return homeRepository.save(home);
    }

//    public void save(Home home){
//        homeRepository.save(home);
//    }

    public boolean deleteById(int id){
        Optional<Home> deleteById = homeRepository.findById(id);
        if (deleteById.isEmpty()){
            log.info("dont deleted");
            return false;
        }
        homeRepository.deleteById(id);
        return true;
    }
}
