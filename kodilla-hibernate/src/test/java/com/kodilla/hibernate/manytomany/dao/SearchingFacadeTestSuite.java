package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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

        } finally {
            //CleanUp
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
        }
    }

    @Test
    void testFindEmployeeByNameFragmentInLastname() {
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Albert", "Novak");
        Employee employee3 = new Employee("Stephen", "Kossack");
        Employee employee4 = new Employee("Naomi", "Rothman");
        Employee employee5 = new Employee("Stephanie", "Mathews");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);

        //When
        List<Employee> employeeList1 = searchingFacade.searchEmployeesByLastNameFragment("th");
        List<Employee> employeeList2 = searchingFacade.searchEmployeesByLastNameFragment("Novak");

        //Then
        try {
            assertEquals(3, employeeList1.size());
            assertEquals(1, employeeList2.size());
        } finally {
            //CleanUp
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
            employeeDao.deleteById(employee4.getId());
            employeeDao.deleteById(employee5.getId());
        }
    }
}
