package peaksoft;

import peaksoft.model.Company;
import peaksoft.service.serviceImpl.CompanyServiceimpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        CompanyServiceimpl companyService=new CompanyServiceimpl();
        System.out.println("           This is a company            ");
       System.out.println(companyService.saveCompany(new Company(1L,"Peaksoft","KG","Grajdanskaya 119"),
               new Company(2L,"Codify","KG","Isanova 123"),
               new Company(3L,"BlaluwerWestern","KG","alksdjf;iawoeg")));
        System.out.println("-----------------------------------");
        System.out.println("          save company           ");
        System.out.println(Arrays.toString(companyService.getAllCompanies()));
        System.out.println("-----------------------------------");
        System.out.println("          get company by ID        ");
        System.out.println(companyService.getCompanyById(1L));
        System.out.println("-----------------------------------");
        System.out.println("          update company           ");
        System.out.println(companyService.upDateCompany(1L, new Company(4L, "Gira ", "KG", "Gde to")));
        System.out.println("-----------------------------------");
        System.out.println("          delete company           ");
        System.out.println(Arrays.toString(companyService.deleteCompany(3L)));



















        //CRUD operation
        //C-create
        //R-read
        //U-update
    }
}