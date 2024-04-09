package com.kebronis.spring6restmvc.mappers;

import com.kebronis.spring6restmvc.entities.Beer;
import com.kebronis.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
