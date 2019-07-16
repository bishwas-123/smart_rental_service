package mum.edu.mycar.repository;

import mum.edu.mycar.domain.Mycar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository  extends JpaRepository<Mycar,Long> {
}
