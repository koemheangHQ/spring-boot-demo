package com.example.demorestapi.service.impl;

import com.example.demorestapi.model.CouldVendor;
import com.example.demorestapi.repository.CloudVendorRepository;
import com.example.demorestapi.service.CouldVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class CloudVendorServiceImpl implements CouldVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CouldVendor couldVendor) {
        //  More business logic
        cloudVendorRepository.save(couldVendor);
        return "Created Success";
    }

    @Override
    public String updateCloudVendor(CouldVendor couldVendor) {
        //  More business logic
        cloudVendorRepository.save(couldVendor);
        return null;
    }

    @Override
    public String deleteCloudVendor(String couldVendorId) {
        //  More business logic
        cloudVendorRepository.deleteById(couldVendorId);
        return "Deleted Success";
    }

    @Override
    public CouldVendor getCloudVendor(String couldVendorId) {
        //  More business logic
       return cloudVendorRepository.findById(couldVendorId).get();

    }

    @Override
    public List<CouldVendor> getAllVendor() {
        //  More business logic
        return cloudVendorRepository.findAll();
    }
}
