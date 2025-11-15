package com.unicesar.factoryMethod.domain;

public class HtmlExporter implements Exporter{
    @Override
    public String export(String reportContent, String destination) {

        return "Exporting in HTML " + reportContent + " to " + destination;

    }
}
