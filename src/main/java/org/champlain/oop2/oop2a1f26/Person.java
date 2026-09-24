package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;

public class Person {

    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean aPurchasedParkingPass;

    public Person(String pName, LocalDate pDOB, String pEmailAddress) {

        if (pName == null || pName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (pDOB == null) {
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }

        if (pDOB.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A person cannot be born in the future.");
        }

        if (pEmailAddress == null || pEmailAddress.trim().isEmpty()) {
            throw new IllegalArgumentException("Email address cannot be null or empty.");
        }

        if (!pEmailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Email address format is invalid.");
        }

        this.aName = pName;
        this.aDOB = pDOB;
        this.aEmailAddress = pEmailAddress;
        this.aPurchasedParkingPass = false;
    }

    public String getName() {
        return this.aName;
    }

    public LocalDate getDOB() {
        return this.aDOB;
    }

    public String getEmailAddress() {
        return this.aEmailAddress;
    }

    public boolean isPurchasedParkingPass() {
        return this.aPurchasedParkingPass;
    }

    public boolean purchaseParkingPass() {
        if (this.aPurchasedParkingPass) {
            return false;
        }

        this.aPurchasedParkingPass = true;
        return true;
    }

    @Override
    public String toString() {
        return "Person{name='" + this.aName
                + "', DOB=" + this.aDOB
                + ", email='" + this.aEmailAddress
                + "', parkingPass=" + this.aPurchasedParkingPass
                + "}";
    }
}