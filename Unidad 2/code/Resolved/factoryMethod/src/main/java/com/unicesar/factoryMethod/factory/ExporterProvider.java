package com.unicesar.factoryMethod.factory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ExporterProvider {

    private Map<String, ExporterCreator> exporterCreator;

    public ExporterProvider() {
        this.exporterCreator = new HashMap<String, ExporterCreator>();
        this.exporterCreator.put("pdf", new PdfExporterCreator());
        this.exporterCreator.put("html", new HtmlExporterCreator());
        this.exporterCreator.put("csv", new CsvExporterCreator());
    }

    public ExporterCreator getExporterCreator(String type) {
        return this.exporterCreator.get(type);
    }

}
