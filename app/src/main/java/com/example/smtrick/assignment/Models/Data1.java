package com.example.smtrick.assignment.Models;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data1 implements Parcelable
{

    @SerializedName("SrNo")
    @Expose
    private Integer srNo;
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("FName")
    @Expose
    private String fName;
    @SerializedName("MName")
    @Expose
    private String mName;
    @SerializedName("LName")
    @Expose
    private String lName;
    @SerializedName("RFName")
    @Expose
    private String rFName;
    @SerializedName("RMName")
    @Expose
    private String rMName;
    @SerializedName("RLName")
    @Expose
    private String rLName;
    @SerializedName("VillageId")
    @Expose
    private Integer villageId;
    @SerializedName("RouteId")
    @Expose
    private Integer routeId;
    @SerializedName("PhoneNo")
    @Expose
    private String phoneNo;
    @SerializedName("MobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("EmailId")
    @Expose
    private String emailId;
    @SerializedName("BranchId")
    @Expose
    private Integer branchId;
    @SerializedName("BankAccountNo")
    @Expose
    private String bankAccountNo;
    @SerializedName("PanNo")
    @Expose
    private String panNo;
    @SerializedName("AadharNo")
    @Expose
    private String aadharNo;
    @SerializedName("CowAccountId")
    @Expose
    private Integer cowAccountId;
    @SerializedName("BuffaloAccountId")
    @Expose
    private Integer buffaloAccountId;
    @SerializedName("RateCardGroupId")
    @Expose
    private Integer rateCardGroupId;
    @SerializedName("CollectionTypeId")
    @Expose
    private Integer collectionTypeId;
    @SerializedName("IsSynch")
    @Expose
    private Integer isSynch;
    @SerializedName("Note")
    @Expose
    private String note;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("TalukaId")
    @Expose
    private Integer talukaId;
    @SerializedName("DistrictId")
    @Expose
    private Integer districtId;
    @SerializedName("StateId")
    @Expose
    private Integer stateId;
    @SerializedName("RouteName")
    @Expose
    private String routeName;
    @SerializedName("VillageName")
    @Expose
    private String villageName;
    @SerializedName("DistrictName")
    @Expose
    private String districtName;
    @SerializedName("StateName")
    @Expose
    private String stateName;
    public final static Creator<Data1> CREATOR = new Creator<Data1>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Data1 createFromParcel(android.os.Parcel in) {
            return new Data1(in);
        }

        public Data1 [] newArray(int size) {
            return (new Data1[size]);
        }

    }
            ;

    protected Data1(android.os.Parcel in) {
        this.srNo = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fName = ((String) in.readValue((String.class.getClassLoader())));
        this.mName = ((String) in.readValue((String.class.getClassLoader())));
        this.lName = ((String) in.readValue((String.class.getClassLoader())));
        this.rFName = ((String) in.readValue((String.class.getClassLoader())));
        this.rMName = ((String) in.readValue((String.class.getClassLoader())));
        this.rLName = ((String) in.readValue((String.class.getClassLoader())));
        this.villageId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.routeId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.phoneNo = ((String) in.readValue((String.class.getClassLoader())));
        this.mobileNo = ((String) in.readValue((String.class.getClassLoader())));
        this.emailId = ((String) in.readValue((String.class.getClassLoader())));
        this.branchId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.bankAccountNo = ((String) in.readValue((String.class.getClassLoader())));
        this.panNo = ((String) in.readValue((String.class.getClassLoader())));
        this.aadharNo = ((String) in.readValue((String.class.getClassLoader())));
        this.cowAccountId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.buffaloAccountId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rateCardGroupId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.collectionTypeId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isSynch = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.note = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.talukaId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.districtId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stateId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.routeName = ((String) in.readValue((String.class.getClassLoader())));
        this.villageName = ((String) in.readValue((String.class.getClassLoader())));
        this.districtName = ((String) in.readValue((String.class.getClassLoader())));
        this.stateName = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Data1() {
    }

    public Integer getSrNo() {
        return srNo;
    }

    public void setSrNo(Integer srNo) {
        this.srNo = srNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getRFName() {
        return rFName;
    }

    public void setRFName(String rFName) {
        this.rFName = rFName;
    }

    public String getRMName() {
        return rMName;
    }

    public void setRMName(String rMName) {
        this.rMName = rMName;
    }

    public String getRLName() {
        return rLName;
    }

    public void setRLName(String rLName) {
        this.rLName = rLName;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public Integer getCowAccountId() {
        return cowAccountId;
    }

    public void setCowAccountId(Integer cowAccountId) {
        this.cowAccountId = cowAccountId;
    }

    public Integer getBuffaloAccountId() {
        return buffaloAccountId;
    }

    public void setBuffaloAccountId(Integer buffaloAccountId) {
        this.buffaloAccountId = buffaloAccountId;
    }

    public Integer getRateCardGroupId() {
        return rateCardGroupId;
    }

    public void setRateCardGroupId(Integer rateCardGroupId) {
        this.rateCardGroupId = rateCardGroupId;
    }

    public Integer getCollectionTypeId() {
        return collectionTypeId;
    }

    public void setCollectionTypeId(Integer collectionTypeId) {
        this.collectionTypeId = collectionTypeId;
    }

    public Integer getIsSynch() {
        return isSynch;
    }

    public void setIsSynch(Integer isSynch) {
        this.isSynch = isSynch;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(Integer talukaId) {
        this.talukaId = talukaId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(srNo);
        dest.writeValue(id);
        dest.writeValue(fName);
        dest.writeValue(mName);
        dest.writeValue(lName);
        dest.writeValue(rFName);
        dest.writeValue(rMName);
        dest.writeValue(rLName);
        dest.writeValue(villageId);
        dest.writeValue(routeId);
        dest.writeValue(phoneNo);
        dest.writeValue(mobileNo);
        dest.writeValue(emailId);
        dest.writeValue(branchId);
        dest.writeValue(bankAccountNo);
        dest.writeValue(panNo);
        dest.writeValue(aadharNo);
        dest.writeValue(cowAccountId);
        dest.writeValue(buffaloAccountId);
        dest.writeValue(rateCardGroupId);
        dest.writeValue(collectionTypeId);
        dest.writeValue(isSynch);
        dest.writeValue(note);
        dest.writeValue(address);
        dest.writeValue(talukaId);
        dest.writeValue(districtId);
        dest.writeValue(stateId);
        dest.writeValue(routeName);
        dest.writeValue(villageName);
        dest.writeValue(districtName);
        dest.writeValue(stateName);
    }

    public int describeContents() {
        return 0;
    }

}

