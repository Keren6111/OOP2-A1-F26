package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;

public class Person {

    private String  aName;
    private final LocalDate aDOB;
    private String aEmailAddress;
    private boolean aPurchasedParkingPass;

    public Person(String pName, LocalDate pDOB, String pEmailAddress) {
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