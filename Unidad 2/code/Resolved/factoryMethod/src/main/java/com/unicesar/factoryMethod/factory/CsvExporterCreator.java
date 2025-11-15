package com.unicesar.factoryMethod.factory;

import com.unicesar.factoryMethod.domain.CsvExporter;
import com.unicesar.factoryMethod.domain.Exporter;
import com.unicesar.factoryMethod.domain.PdfExporter;

public class CsvExporterCreator extends ExporterCreator {
    public CsvExporterCreator() {}

    @Override
    public Exporter create() {
        return new CsvExporter();
    }
}
