package com.g15.jpa.controller;

import com.g15.jpa.entity.Admin;
import com.g15.jpa.entity.Farm;
import com.g15.jpa.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jonat
 */
@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/all")
    public List<Admin> getAdmin(){
        return adminService.getAdmin();
    }
    
    @PostMapping("/save")
    public ResponseEntity insertAdmin(@RequestBody Admin admin){
       adminService.insertAdmin(admin);
       return ResponseEntity.status(201).build();
    }
}
