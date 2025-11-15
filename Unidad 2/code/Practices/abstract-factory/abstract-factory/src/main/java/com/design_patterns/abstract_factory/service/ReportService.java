package com.design_patterns.abstract_factory.service;

import com.design_patterns.abstract_factory.domain.*;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public String generateReport(FormatType format) {
        Header header;
        Body body;
        Footer footer;

        switch (format) {
            case PDF:
                header = new PdfHeader();
                body = new PdfBody();
                footer = new PdfFooter();
                break;
            case HTML:
                header = new HtmlHeader();
                body = new HtmlBody();
                footer = new HtmlFooter();
                break;

            default:
                throw new IllegalArgumentException("Formato no soportado");
        }

        return header.getContent() + "\n" + body.getContent() + "\n" + footer.getContent();
    }
}
