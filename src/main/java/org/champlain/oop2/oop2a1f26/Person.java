package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;

/**
 * Represent a person(and his/her info) that can buy a parking Pass
 */
public class Person {

    /**
     * Saves person's name.
     */
    private final String aName;

    /**
     * Saves person's date of birth.
     */
    private final LocalDate aDOB;

    /**
     * Saves person's email address
     */
    private final String aEmailAddress;

    /**
     * Saves wheter the person has purschased a parking pass or not
     */
    private boolean aPurchasedParkingPass;

    /**
     * Creates a new instance of a Person with a name, date of birth, and email address.
     * The person does not have a parking pass at the very beginning yet
     * @param pName The person's name
     * @param pDOB  The person's date of birth
     * @param pEmailAddress The person's email add.
     * @throws IllegalArgumentException If the name, date of birth, or email address is invalid.
     */
    public Person(String pName, LocalDate pDOB, String pEmailAddress) {

        if (pName == null || pName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (pDOB == null) {
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }

        /**
         * Checks that the person's date of birth is not in the future.
         */
        if (pDOB.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A person cannot be born in the future.");
        }

        if (pEmailAddress == null || pEmailAddress.trim().isEmpty()) {
            throw new IllegalArgumentException("Email address cannot be null or empty.");
        }

        /**
         * Checks that the email address has a valid format.
         */
        if (!pEmailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Email address format is invalid.");
        }

        this.aName = pName;
        this.aDOB = pDOB;
        this.aEmailAddress = pEmailAddress;
        this.aPurchasedParkingPass = false;
    }

    /**
     * Gets the person's name.
     *
     * @return the person's name.
     */
    public String getName() {
        return this.aName;
    }

    /**
     * Gets the person's date of birth
     *
     * @return the person's date of birth
     */
    public LocalDate getDOB() {
        return this.aDOB;
    }

    /**
     * Gets the person's email add
     *
     * @return the person's email add
     */
    public String getEmailAddress() {
        return this.aEmailAddress;
    }

    /**
     * Checks whether the person has purchased a parking pass.
     *
     * @return True if the person has a parking pass, false otherwise.
     */
    public boolean isPurchasedParkingPass() {
        return this.aPurchasedParkingPass;
    }

    /**
     * Purchases a parking pass for the person if they do not already
     * have one.
     *
     * @return True if the parking pass was purchased, false if the
     * person already had a parking pass.
     */
    public boolean purchaseParkingPass() {
        if (this.aPurchasedParkingPass) {
            return false;
        }

        this.aPurchasedParkingPass = true;
        return true;
    }

    /**
     * Returns the String representation of the person's information.
     *
     * @return The String representation of the person.
     */
    @Override
    public String toString() {
        return "Person{name='" + this.aName
                + "', DOB=" + this.aDOB
                + ", email='" + this.aEmailAddress
                + "', parkingPass=" + this.aPurchasedParkingPass
                + "}";
    }
}