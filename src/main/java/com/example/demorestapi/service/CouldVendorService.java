package com.example.demorestapi.service;

import com.example.demorestapi.model.CouldVendor;

import java.util.List;

public interface CouldVendorService {
  public String createCloudVendor(CouldVendor couldVendor);
  public String updateCloudVendor(CouldVendor couldVendor);
  public String deleteCloudVendor(String couldVendorId);
  public CouldVendor getCloudVendor(String couldVendorId);
  public List<CouldVendor> getAllVendor();
}
