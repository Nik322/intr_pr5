package com.example.intr_pr5.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ContactsRequest {
    private String name;
    private String phone;
    private String workPhone;
    private String email;
}
