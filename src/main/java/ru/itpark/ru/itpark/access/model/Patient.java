package ru.itpark.ru.itpark.access.model;

public class Patient {
    private String privateField = "private";
    String packageField = "package";
    protected String protectedField = "protected";

    public int compare(Patient other) {
        other.privateField = "inner";
        return privateField.compareToIgnoreCase(other.privateField);
    }
}
