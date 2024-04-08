package com.github.jinahya.openapi.bind;

import jakarta.validation.constraints.NotNull;

public class InfoObject {

    @NotNull
    private String title;

    private String summary;

    private String description;

    private String termsOfService;

    private ContactObject contact;

    private LicenseObject license;

    @NotNull
    private String version;
}
