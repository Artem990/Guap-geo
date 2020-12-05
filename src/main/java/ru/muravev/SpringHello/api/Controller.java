package ru.muravev.SpringHello.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.muravev.SpringHello.dao.repositories.GeoObjectRepository;
import ru.muravev.SpringHello.model.ControllerUtil;
import ru.muravev.SpringHello.model.Dump;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/geo")
public class Controller {
    @Autowired
    private GeoObjectRepository geoObjectRepository;

    @GetMapping
    public List<Dump> getGeoObjects () {
        return geoObjectRepository.findAll();
    }

    @GetMapping(value="/dates")
    public List<String> getDates() {
        List<String> dates = ControllerUtil.getUniqueDates(geoObjectRepository.findAll());
        return dates;
    }

}
