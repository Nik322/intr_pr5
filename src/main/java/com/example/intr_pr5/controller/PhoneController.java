package com.example.intr_pr5.controller;

import com.example.intr_pr5.model.Contact;
import com.example.intr_pr5.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.intr_pr5.model.ContactsRequest;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contacts")
public class PhoneController {
    private final ContactService service;

    @GetMapping
    public List<Contact> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/search")
    public List<Contact> search(String query) {
        return service.search(query);
    }

    @PostMapping
    public Contact create(@RequestBody ContactsRequest request) {
        return service.create(request);
    }

    @PutMapping
    public Contact update(@RequestBody Contact contact) {
        return service.save(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
