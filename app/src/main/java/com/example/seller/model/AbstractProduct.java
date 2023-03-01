package com.example.seller.model;

public
abstract class AbstractProduct {

    //Field
    String mCaseName;
    Integer mCaseId;
    Integer mCounter;
    String  mCaseDescription;
    //constructor

    public
    AbstractProduct(String mCaseName , Integer mCaseId , Integer mCounter , String mCaseDescription)
        {
        this.mCaseName        = mCaseName;
        this.mCaseId          = mCaseId;
        this.mCounter         = mCounter;
        this.mCaseDescription = mCaseDescription;
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
    Integer getCounter()
        {
        return mCounter;
        }

    public
    void setCounter(Integer mCounter)
        {
        this.mCounter = mCounter;
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
}
