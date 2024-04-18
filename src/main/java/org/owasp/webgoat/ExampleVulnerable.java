package org.owasp.webgoat;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExampleVulnerable {
    public static void main(String[] args) throws Exception {
        String jsonPayload = "{\"@type\":\"com.example.MyClass\",\"someField\":\"someValue\"}";

        ObjectMapper mapper = new ObjectMapper();
        MyClass obj = mapper.readValue(jsonPayload, MyClass.class);
        System.out.println(obj.getSomeField());
    }
}

class MyClass {
    private String someField;

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }
}
