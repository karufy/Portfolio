package org.ochiugo.casestudy.daorepository;

import org.ochiugo.casestudy.modelentity.MySoftwareList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Not necessary to add @Repository and @Transactional annotations because JPA made the repository transactional.
//Just kept it for visibility
@Repository
public interface MySoftwareRepository extends JpaRepository<MySoftwareList,Integer> {
}
