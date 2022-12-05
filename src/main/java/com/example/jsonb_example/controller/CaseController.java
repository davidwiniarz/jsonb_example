package com.example.jsonb_example.controller;

import com.example.jsonb_example.model.DocumentCase;
import com.example.jsonb_example.repository.CaseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CaseController {

    private final CaseRepository caseRepository;

    public CaseController(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    @GetMapping("/cases")
    public Flux<DocumentCase> getCases() {
        return caseRepository.findAll();
    }

    @GetMapping("/cases/{id}")
    public Mono<DocumentCase> getCase(@PathVariable("id") Long id) {
        return caseRepository.findById(id);
    }

    @GetMapping("/cases/age/{age}")
    public Mono<DocumentCase> getCase(@PathVariable("age") String age) {
        return caseRepository.findByAge(age);
    }
}