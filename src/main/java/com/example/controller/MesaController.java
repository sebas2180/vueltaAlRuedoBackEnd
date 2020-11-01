package com.example.controller;

import java.util.HashMap;

import com.example.model.MesaModel;
import com.example.service.MesaServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesaController {


    @Autowired
    MesaServiceImpl mesaServiceImpl;

    @PostMapping(value="/mesa/add")
    public HashMap addMesa(@ModelAttribute MesaModel mesaParameters){
        try {
            HashMap<String,String> map = new HashMap<>();
            System.out.println(mesaParameters);
            Long repuesta = mesaServiceImpl.save(mesaParameters);
            map.put("id_mesa", String.valueOf(repuesta));
            return map;
        } catch (Exception e) {
            System.err.println(e);
        }

        return null;
    }
    @PostMapping(value="/mesa/update")
    public HashMap updateArticulo(@ModelAttribute MesaModel mesaParameters){
        HashMap<String,String> map = new HashMap();
        try {
          map.put( "repuesta",mesaServiceImpl.update(mesaParameters));
          return map;
        } catch (Exception e) {
            map.put( "repuesta",String.valueOf(e));
        }
        return null;
    }
    @GetMapping(value ="/mesa/listAll")
    public List findAll(){
        List mesas =  mesaServiceImpl.findAll();
        return mesas;      
    }
    
}
