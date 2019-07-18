package com.solam.ea.solam_return.dao;




import com.solam.ea.solam_return.domain.ReturnDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface ReturnDAO extends JpaRepository<ReturnDomain, Long> {

    List<ReturnDomain> findReturnsByCustomerId(long id);

    List<ReturnDomain> findReturnsByCheckOutEquals(Date date);

    List<ReturnDomain> findReturnsByPaymentId(long id);

    List<ReturnDomain> findReturnByRentId(long id);

}
