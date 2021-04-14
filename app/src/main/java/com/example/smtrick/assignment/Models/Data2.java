package com.example.smtrick.assignment.Models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data2 implements Parcelable
{

    @SerializedName("PageNo")
    @Expose
    private String pageNo;
    @SerializedName("TotalCount")
    @Expose
    private Integer totalCount;
    public final static Creator<Data2> CREATOR = new Creator<Data2>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Data2 createFromParcel(android.os.Parcel in) {
            return new Data2(in);
        }

        public Data2 [] newArray(int size) {
            return (new Data2[size]);
        }

    }
            ;

    protected Data2(android.os.Parcel in) {
        this.pageNo = ((String) in.readValue((String.class.getClassLoader())));
        this.totalCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Data2() {
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(pageNo);
        dest.writeValue(totalCount);
    }

    public int describeContents() {
        return 0;
    }

}