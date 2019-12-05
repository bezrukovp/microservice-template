package com.epam.template.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ui/locations")
public class LocationController {

    @Autowired
    LocationDAOImpl locationDAO;

    @GetMapping(value = "{id}", produces = "application/json")
    public @ResponseBody
    LocationDto getLocation(@PathVariable long id) {
        return locationDAO.getLocation(id);
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody List<LocationDto> getLocations(){
        return locationDAO.getLocations();
    }

}
