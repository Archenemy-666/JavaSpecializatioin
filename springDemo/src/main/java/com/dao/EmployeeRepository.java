package com.dao ;
import com.model.Employee ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByEmployeeName(String employeeName) ;

    @Query("from Employee order by employeeName")
    List<Employee> findAllSorted();
}