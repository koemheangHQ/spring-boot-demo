package com.example.demorestapi.controller;

import com.example.demorestapi.model.CouldVendor;
import com.example.demorestapi.service.CouldVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couldvendor")
public class CouldVendorController {

    //    CouldVendor couldVendor;
    CouldVendorService couldVendorService;
    public CouldVendorController(CouldVendorService couldVendorService) {
        this.couldVendorService = couldVendorService;
    }

    // For doing fetch data from database...ect. and read specific Vendor details...
    @GetMapping("{vendorId}")
    public CouldVendor getCouldVendorDetails(@PathVariable("vendorId")  String vendorId){
        return couldVendorService.getCloudVendor(vendorId);
    }
    // Read all vendor details...
    @GetMapping("/")
    public List<CouldVendor> getCouldVendorAllDetails(){
        return couldVendorService.getAllVendor();
    }
    // For create data in record...
    @PostMapping
    public  String createDetailCouldVendor(@RequestBody CouldVendor couldVendor){
         couldVendorService.createCloudVendor(couldVendor);
        return  "Could Vendor Created Successfully";
    }
    // For update data in the record...
    @PutMapping
    public  String updateDetailColdVendor(@RequestBody CouldVendor couldVendor){
       couldVendorService.updateCloudVendor(couldVendor);
        return  "Could Vendor Updated Successfully";
    }
    // For doing on method delete... main of delete record by only id it...
    @DeleteMapping("{vendorId}")
    public String deleteDetailCloudVendor( @PathVariable("vendorId")  String vendorId){
        couldVendorService.deleteCloudVendor(vendorId);
        return  "Could Vendor Deleted Successfully";
    }
}
