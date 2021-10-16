package am.realestate.realestate.services;

import am.realestate.realestate.model.Home;
import am.realestate.realestate.services.impl.HomeServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService implements HomeServiceimpl {


    @Override
    public Home getById(int id) {
        return null;
    }

    @Override
    public void save(Home home) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Home> getAllHomes() {
        return null;
    }
}
