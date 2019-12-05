package com.epam.template.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequestMapping("ui/locations")
public class LocationController {

    @Autowired
    LocationDAOImpl locationDAO;

    @GetMapping("/{id}", produces = "application/json")
    public @ResponseBody LocationDto getLocation(@PathVariable long id) {
        return locationDAO.getLocation(id);
    }

    @GetMapping("/", produces = "application/json")
    public List<LocationDto> getLocations(){
        return locationDAO.getLocations();
    }

}
