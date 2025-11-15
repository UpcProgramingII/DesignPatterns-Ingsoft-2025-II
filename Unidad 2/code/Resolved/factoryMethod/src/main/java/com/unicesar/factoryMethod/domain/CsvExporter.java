package com.unicesar.factoryMethod.domain;

public class CsvExporter implements Exporter {
    @Override
    public String export(String reportContent, String destination) {

        return "Exporting in csv" + reportContent + " to " + destination;

    }
}
