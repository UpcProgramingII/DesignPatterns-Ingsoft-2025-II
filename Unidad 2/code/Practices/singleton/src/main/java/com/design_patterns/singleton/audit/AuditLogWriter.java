package com.design_patterns.singleton.audit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AuditLogWriter {

    public static int CONTADOR = 0;

    public AuditLogWriter(){
        CONTADOR++;
    }

    public void log(String message) {
        String timestamp = LocalDateTime.now().toString();
        String auditData="[AUDIT] " + timestamp + " - " + message;
        System.out.println(auditData);
    }

}
