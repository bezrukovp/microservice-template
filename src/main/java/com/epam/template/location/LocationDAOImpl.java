package com.epam.template.location;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationDAOImpl implements LocationDAO {

    ArrayList<LocationDto> locationDtos;
    {
        locationDtos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LocationDto locationDto = new LocationDto();
            locationDto.setId((long) i);
            locationDto.setAddress("Addres" + i);
            locationDto.setLocationTypeInt(String.valueOf(i%3));
            locationDto.setLocationTypeLoc("1");
            locationDtos.add(locationDto);
        }
//                new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    }


    public LocationDto getLocation(Long id) {
        return locationDtos.get(Integer.parseInt(String.valueOf(id)));
    }

    public List<LocationDto> getLocations(){
        return locationDtos;
    }

}
