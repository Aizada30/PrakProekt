package peaksoft.service;

import peaksoft.model.Company;

public interface CompanyService {
    //CRUD
    String saveCompany(Company ... company);
    Company[] getAllCompanies();
    Company getCompanyById(Long id);
    Company upDateCompany(Long oldCompanyId,Company newCompany);
    Company[] deleteCompany(Long id);



}
