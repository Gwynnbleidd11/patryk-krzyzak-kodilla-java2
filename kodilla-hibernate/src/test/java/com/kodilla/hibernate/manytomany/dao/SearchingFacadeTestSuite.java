package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.facade.SearchingFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
@Transactional
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindCompaniesByNameFragment() {
        //Given
        Company company1 = new Company("Company XYZ");
        Company company2 = new Company("ABC Company");
        Company company3 = new Company("BBS International");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> result = searchingFacade.searchCompaniesByNameFragment("XYZ");

        //Then
        try {
            assertEquals(1, result.size());
            assertEquals("Company XYZ", result.get(0).getName());
//            assertEquals("XYZ International", result.get(1).getName());

        } finally {
            //CleanUp
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
        }
    }
}
