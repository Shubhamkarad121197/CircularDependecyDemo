package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportService {

    public ReportService(){
        System.out.println("ReportService Created");
    }
}
