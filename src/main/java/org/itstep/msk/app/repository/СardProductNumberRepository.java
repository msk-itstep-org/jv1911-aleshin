package org.itstep.msk.app.repository;

import org.itstep.msk.app.entity.numberСard.ProductNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface СardProductNumberRepository extends JpaRepository<ProductNumber, Integer> {
}
