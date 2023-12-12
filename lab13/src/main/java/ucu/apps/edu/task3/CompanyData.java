package ucu.apps.edu.task3;

import lombok.Builder;

public class CompanyData {
    @Builder
    private String domain;
    private String description;
    private String logo;
    private String address;
    
}