package peaksoft.service.serviceImpl;

import peaksoft.model.Company;
import peaksoft.service.CompanyService;

public class CompanyServiceimpl implements CompanyService {

    private Company[] companies;

    @Override
    public String saveCompany(Company... company) {
        Company[] companies1;
        if(companies==null){
            this.companies=company;
        }
        else{
            companies1=new Company[companies.length+company.length];
            for (int i = 0; i < companies.length; i++) {
                companies1[i]=companies[i];
            }
            companies=companies1;
        }
        return "Successfully saved ...";
    }

    @Override
    public Company[] getAllCompanies() {
        return companies;
    }

    @Override
    public Company getCompanyById(Long id) {
        for (int i = 0; i <companies.length ; i++) {
            if(companies[i].getId()==id){
                return companies[i];
            }
        }
        return null;
    }

    @Override
    public Company upDateCompany(Long oldCompanyId, Company newCompany) {
        Company oldCompany = getCompanyById(oldCompanyId);
        oldCompany.setId(newCompany.getId());
        oldCompany.setName(newCompany.getName());
        oldCompany.setCountry(newCompany.getCountry());
        oldCompany.setAdress(newCompany.getAdress());
        oldCompany.setGroups(newCompany.getGroups());
        oldCompany.setInstructors(newCompany.getInstructors());
        oldCompany.setStudents(newCompany.getStudents());
        return oldCompany;
    }

    @Override
    public Company[] deleteCompany(Long id) {
        Company companyById=getCompanyById(id);
        for (int i = 0; i < companies.length; i++) {
            if(companies[i].equals(companyById)){
                companies[i]=null;
            }
        }
        return companies;
    }
}
