package com.example.intr_pr5.service;

import com.example.intr_pr5.model.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.intr_pr5.repository.ContactRepository;
import com.example.intr_pr5.model.ContactsRequest;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact getById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        contactRepository.deleteById(id);
    }

    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    public Contact create(ContactsRequest request) {
        Contact contact = Contact.builder()
            .name(request.getName())
            .phone(request.getPhone())
            .workPhone(request.getWorkPhone())
            .email(request.getEmail())
            .build();
        return contactRepository.save(contact);
    }

    public List<Contact> search(String query) {
        return contactRepository.findByNameContainingIgnoreCase(query);
    }
}
