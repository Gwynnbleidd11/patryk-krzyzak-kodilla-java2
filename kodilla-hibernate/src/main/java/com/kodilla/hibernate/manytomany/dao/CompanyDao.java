package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesWith3FirstLetters(@Param("PARAM") String threeFirstLetters);

    @Query(nativeQuery = true)
    List<Company> retrieveCompaniesByNameFragment(@Param("nameFragment") String nameFragment);
}
