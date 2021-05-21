package com.microservices.msccbeerservice.web.mappers;

import com.microservices.msccbeerservice.domain.Beer;
import com.microservices.msccbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
