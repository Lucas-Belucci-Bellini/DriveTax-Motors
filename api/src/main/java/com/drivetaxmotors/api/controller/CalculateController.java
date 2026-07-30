package com.drivetaxmotors.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculateController {

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Object>> calculate(@RequestBody Map<String, Object> payload) {
        // Por enquanto retornamos um resultado de exemplo; integração com core_engine pode ser feita
        // chamando o script Python ou delegando a um serviço interno.
        try {
            Path output = Path.of("../core_engine/output.json").toAbsolutePath().normalize();
            if (Files.exists(output)) {
                String json = Files.readString(output);
                return ResponseEntity.ok(Map.of("status", "ok", "result_json", json));
            }
        } catch (IOException ignored) {
        }
        return ResponseEntity.ok(Map.of("status", "ok", "echo", payload));
    }
}
