package org.itstep.msk.app.repository.documentsUserRepository;

import org.itstep.msk.app.entity.documentsUser.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
