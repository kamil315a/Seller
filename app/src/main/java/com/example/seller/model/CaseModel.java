package com.example.seller.model;

import android.widget.ImageView;

public
class CaseModel {

    //Field
    Integer mCaseId;
    String  mCaseCompany;
    ImageView mCaseCompanyLogo; // hard to tell what should i do with ImageView.
                                // The image should be load from local disk or from MYSQL DB?
    String  mCaseName;
    String  mCaseDescription;
    Integer mCounter;
    //constructor


    public
    CaseModel(Integer mCaseId , String mCaseCompany , String mCaseName , String mCaseDescription , Integer mCounter)
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
