package com.harry.mvcrestdoc.web.mappers;

import com.harry.mvcrestdoc.domain.Beer;
import com.harry.mvcrestdoc.models.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}