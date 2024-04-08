package com.github.jinahya.openapi.bind;

import jakarta.validation.constraints.Email;

public class ContactObject {

    private String name;

    private String url;

    @Email
    private String email;
}
