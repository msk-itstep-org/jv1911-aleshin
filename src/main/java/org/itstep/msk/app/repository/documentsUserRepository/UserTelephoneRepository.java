package org.itstep.msk.app.repository.documentsUserRepository;

import org.itstep.msk.app.entity.documentsUser.contactInformation.UserTelephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTelephoneRepository extends JpaRepository<UserTelephone, Integer> {
}