package com.epam.template.location;

import java.util.List;

public interface LocationDAO {

    public LocationDto getLocation(long id);
    public List<LocationDto> getLocations();
}
