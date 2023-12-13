package ucu.apps.edu.task3;

public class CompanyEnricher {
    public CompanyData enrich(CompanyData companyData) {
        return companyData.builder().build();
    }
    
}
