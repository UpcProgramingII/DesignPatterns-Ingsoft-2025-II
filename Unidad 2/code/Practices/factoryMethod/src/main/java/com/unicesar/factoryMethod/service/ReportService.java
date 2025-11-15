package com.unicesar.factoryMethod.service;

import com.unicesar.factoryMethod.domain.CsvExporter;
import com.unicesar.factoryMethod.domain.*;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public Exporter generateReport(String format){

        if(format.equals("csv")){
            return new CsvExporter();
        } else if (format.equals("pdf")) {
            return new PdfExporter();
        } else if (format.equals("html")) {
            return new HtmlExporter();
        }
        else{
            return null;
        }

    }

}
