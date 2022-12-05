DROP TABLE IF EXISTS document_cases;

CREATE TABLE document_cases
(
    id          serial NOT NULL PRIMARY KEY,
    insert_date date   NOT NULL,
    case_item   jsonb default '{}'
);