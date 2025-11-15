package com.unicesar.factoryMethod.controller;

import com.unicesar.factoryMethod.domain.Exporter;
import com.unicesar.factoryMethod.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private ReportService  service;

    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<?> getReport(@RequestBody ReportGenerateRequest request) {

        Exporter exporter = service.generateReport(request.format());
        if (exporter != null) {
            return ResponseEntity.ok(exporter.export(request.data(), request.destination()));
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Formato de reporte no soportado");
        }
    }


}
