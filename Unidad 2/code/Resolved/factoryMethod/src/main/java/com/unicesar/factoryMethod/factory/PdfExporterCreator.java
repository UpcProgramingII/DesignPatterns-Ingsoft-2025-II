package com.unicesar.factoryMethod.factory;

import com.unicesar.factoryMethod.domain.Exporter;
import com.unicesar.factoryMethod.domain.PdfExporter;

public class PdfExporterCreator extends ExporterCreator {
    public PdfExporterCreator() {}

    @Override
    public Exporter create() {
        return new PdfExporter();
    }
}
