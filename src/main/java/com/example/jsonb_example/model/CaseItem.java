package com.example.jsonb_example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaseItem implements Serializable {

    private int id;
    private Date creationDate;
    private String caseApplicant;
    private int caseApplicantType;
    private int caseApplicantChannelId;
    private String caseExecutor;
    private int caseExecutorType;
    private int caseExecutorChannelId;
    private int caseStatus;
    private int caseType;
    private String caseGroup;
    private String caseServiceDomain;
    private Date lastModificationDate;
    private String sourceCaseId;
    private String referralCode;
    private String referralCodeType;
    private String externalId;
    private CaseData caseData;
    private ArrayList<CaseStatusHistory> caseStatusHistory;
    private ArrayList<CustomerDatum> customerData;
    private ArrayList<Decision> decision;
    private String eventType;
    private String eventDesc;
    private String eventDetail;
    private String systemName;
    private int domain;
    private int increaseFlag;
    private ArrayList<Document> document;
}
