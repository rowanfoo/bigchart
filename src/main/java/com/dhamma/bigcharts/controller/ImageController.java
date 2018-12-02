package com.dhamma.bigcharts.controller;


import com.dhamma.bigcharts.data.entity.ImageData;
import com.dhamma.bigcharts.services.ImageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ImageController {
@Autowired
    ImageProducerService imageProducerService;

    @GetMapping("getimage")
    public ImageData getImage(String code){
        System.out.println("---------GET IMAGE-------" );
     try {
         return imageProducerService.getImageData(code);
     }catch (Exception e){
         System.out.println("---------ERROR-------" + e);
     }
     return  null;
    }


}
