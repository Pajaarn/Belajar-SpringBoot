package com.fajar.mybackend.controller;

import com.fajar.mybackend.model.HaloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aspi/v1")
public class HaloController {
    @GetMapping("/halo")
    public HaloResponse sapaDunia() {
        HaloResponse response = new HaloResponse("Halo dari Microservice Spring Boot!", "OK");

        return response;
}

    @GetMapping("/test")
        public String testKoneksi() {
    return "Koneksi berhasil!";
    }
}
