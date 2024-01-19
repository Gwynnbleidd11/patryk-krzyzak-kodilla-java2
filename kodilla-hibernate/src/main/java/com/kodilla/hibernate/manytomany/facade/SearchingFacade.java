package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompaniesByNameFragment(String nameFragment) {
        return companyDao.retrieveCompaniesByNameFragment(nameFragment);
    }

    public List<Employee> searchEmployeesByLastNameFragment(String lastNameFragment) {
        return employeeDao.retrieveEmployeesByLastNameFragment(lastNameFragment);
    }
}
