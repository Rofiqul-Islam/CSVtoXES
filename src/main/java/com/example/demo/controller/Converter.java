package com.example.demo.controller;

import com.example.demo.model.Test;
import com.example.demo.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

@RestController
public class Converter {

    @Autowired
    ConverterService converterService;

    @GetMapping("csvtoxes")
    public String csbToXesConverter(@RequestParam String filePath){
        converterService.csvToXes(filePath);
        return null;
    }

    @GetMapping("getAll")
    public List<Test> getAll(){
        return converterService.getALL();

    }

}
