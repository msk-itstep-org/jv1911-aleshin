package org.itstep.msk.app.repository;

import org.itstep.msk.app.entity.numberСard.NumberCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberCartRepository extends JpaRepository<NumberCart, Integer> {
}
