package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String checkEligibility() {
        StringBuilder reason = new StringBuilder();

        if (age < 18) {
            reason.append("Underage (Age must be >= 18). ");
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            reason.append("Not a citizen (Must be an Indian citizen). ");
        }
        if (voterId == null || voterId.trim().isEmpty() || !isIdValid) {
            reason.append("Invalid or missing Voter ID. ");
        }

        if (reason.length() == 0) {
            return "ELIGIBLE";
        } else {
            return "NOT ELIGIBLE. Reason: " + reason.toString().trim();
        }
    }

    public String getName() { return name; }
}
