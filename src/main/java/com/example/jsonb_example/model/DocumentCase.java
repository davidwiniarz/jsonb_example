package com.example.jsonb_example.model;

import com.example.jsonb_example.serializer.PgJsonObjectDeserializer;
import com.example.jsonb_example.serializer.PgJsonObjectSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vladmihalcea.hibernate.type.json.JsonType;
import io.r2dbc.postgresql.codec.Json;
import lombok.*;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "document_cases")
@JsonInclude(JsonInclude.Include.NON_NULL)
@TypeDef(name = "json", typeClass = JsonType.class)
public class DocumentCase implements Serializable
{
    @Id
    @Column
    private Long id;

    @Column
    private LocalDate insertDate;

    @Column
    @JsonSerialize(using = PgJsonObjectSerializer.class)
    @JsonDeserialize(using = PgJsonObjectDeserializer.class)
    private Json caseItem;

}
