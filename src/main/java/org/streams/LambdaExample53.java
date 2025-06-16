package org.streams;

import java.util.Optional;

public class LambdaExample53 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        try {
            String value = optional.orElseThrow(() -> new RuntimeException("No value present"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }
