package com.unicesar.factoryMethod.service;

import com.unicesar.factoryMethod.domain.CsvExporter;
import com.unicesar.factoryMethod.domain.*;
import com.unicesar.factoryMethod.factory.ExporterCreator;
import com.unicesar.factoryMethod.factory.ExporterProvider;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private ExporterProvider exporterProvider;

    public ReportService(ExporterProvider exporterProvider) {
        this.exporterProvider = exporterProvider;
    }


    public Exporter generateReport(String format){

        ExporterCreator creator=this.exporterProvider.getExporterCreator(format);
        if(creator==null){
            return null;
        }
        return creator.createExporter();

    }

}
