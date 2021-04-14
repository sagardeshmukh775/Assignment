package com.example.smtrick.assignment.Models;

import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.example.smtrick.assignment.Models.Data1;
import com.example.smtrick.assignment.Models.Data2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example implements Parcelable
{

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("data1")
    @Expose
    private List<Data1> data1 = null;
    @SerializedName("data2")
    @Expose
    private List<Data2> data2 = null;
    public final static Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(android.os.Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    }
            ;

    protected Example(android.os.Parcel in) {
        this.data = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data1, (Data1.class.getClassLoader()));
        in.readList(this.data2, (Data2.class.getClassLoader()));
    }

    public Example() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Data1> getData1() {
        return data1;
    }

    public void setData1(List<Data1> data1) {
        this.data1 = data1;
    }

    public List<Data2> getData2() {
        return data2;
    }

    public void setData2(List<Data2> data2) {
        this.data2 = data2;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(data);
        dest.writeList(data1);
        dest.writeList(data2);
    }

    public int describeContents() {
        return 0;
    }

}
