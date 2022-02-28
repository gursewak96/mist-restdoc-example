package com.harry.mvcrestdoc.repositories;

import com.harry.mvcrestdoc.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
