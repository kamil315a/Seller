package com.example.seller.model;

public
class Case {

    //Field
    Integer mCaseId;
    String  mCaseCompany;
    String  mCaseName;
    String  mCaseDescription;
    Integer mCounter;
    //constructor


    public
    Case(Integer mCaseId , String mCaseCompany , String mCaseName , String mCaseDescription , Integer mCounter)
        {
        this.mCaseId          = mCaseId;
        this.mCaseCompany     = mCaseCompany;
        this.mCaseName        = mCaseName;
        this.mCaseDescription = mCaseDescription;
        this.mCounter         = mCounter;
        }


    public
    Integer getCaseId()
        {
        return mCaseId;
        }

    public
    void setCaseId(Integer mCaseId)
        {
        this.mCaseId = mCaseId;
        }

    public
    String getCaseCompany()
        {
        return mCaseCompany;
        }

    public
    void setCaseCompany(String mCaseCompany)
        {
        this.mCaseCompany = mCaseCompany;
        }

    public
    String getCaseName()
        {
        return mCaseName;
        }

    public
    void setCaseName(String mCaseName)
        {
        this.mCaseName = mCaseName;
        }

    public
    String getCaseDescription()
        {
        return mCaseDescription;
        }

    public
    void setCaseDescription(String mCaseDescription)
        {
        this.mCaseDescription = mCaseDescription;
        }

    public
    Integer getCounter()
        {
        return mCounter;
        }

    public
    void setCounter(Integer mCounter)
        {
        this.mCounter = mCounter;
        }
}
