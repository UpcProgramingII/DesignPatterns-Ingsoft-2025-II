package com.unicesar.factoryMethod.factory;

import com.unicesar.factoryMethod.domain.Exporter;

public abstract class ExporterCreator {

    public Exporter createExporter() {
        return this.create();
    }

    public abstract Exporter create();

}
