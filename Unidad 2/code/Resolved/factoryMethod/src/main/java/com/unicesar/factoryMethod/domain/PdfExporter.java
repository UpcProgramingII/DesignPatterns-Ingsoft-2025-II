package com.unicesar.factoryMethod.domain;

public class PdfExporter implements Exporter{
    @Override
    public String export(String reportContent, String destination) {

        return "Exporting in PDF " + reportContent + " to " + destination;

    }
}
