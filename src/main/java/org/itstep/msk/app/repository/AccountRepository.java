package org.itstep.msk.app.repository;

import org.itstep.msk.app.entity.Account;
import org.itstep.msk.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository <Account, Integer> {
   List <Account> findByOwner(User owner);

}
