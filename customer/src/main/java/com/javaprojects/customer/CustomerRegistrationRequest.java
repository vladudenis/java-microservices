package com.javaprojects.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
