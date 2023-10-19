package com.example.demorestapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "could_vendor_info")
public class CouldVendor {
    @Id
    private  String vendorId;
    private  String vendorName;
    private  String vendorAddress;
    private  String vendorPhone;

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }
    public CouldVendor(){}
    public CouldVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
    }
}
