package com.example.jsonb_example.model;
import java.util.ArrayList;
import java.util.List;
public class CustomerDatum{
    public String id;
    public String birthDate;
    public String childrenBirthDates;
    public int customerRoleType;
    public int cif;
    public String identityDocType;
    public String identityDocSetNo;
    public String identityNbr;
    public int nik;
    public ArrayList<RetailFinancialDatum> retailFinancialData;
    public String firstName;
    public String lastName;
    public int parentBranchCode;
    public int numberOfHouseholdMembers;
    public CreditWorthinessData creditWorthinessData;
    public ArrayList<Address> address;
}
