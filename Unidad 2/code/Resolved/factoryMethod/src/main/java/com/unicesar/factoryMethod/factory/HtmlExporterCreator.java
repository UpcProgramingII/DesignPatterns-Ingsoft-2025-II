package com.unicesar.factoryMethod.factory;

import com.unicesar.factoryMethod.domain.Exporter;
import com.unicesar.factoryMethod.domain.HtmlExporter;
import com.unicesar.factoryMethod.domain.PdfExporter;

public class HtmlExporterCreator extends ExporterCreator {
    public HtmlExporterCreator() {}

    @Override
    public Exporter create() {
        return new HtmlExporter();
    }
}
