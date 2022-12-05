package com.example.jsonb_example.repository;

import com.example.jsonb_example.model.DocumentCase;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CaseRepository extends ReactiveCrudRepository<DocumentCase, Long> {

    @Query(value = "SELECT dc.* FROM document_cases dc " +
                   "WHERE jsonb_extract_path_text(dc.case_item, 'age') = $1")
    Mono<DocumentCase> findByAge(@Param(value = "age") String age);
}