package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message="Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;
    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message="Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Location is required")
    private String location;

    private boolean attendantRegister = true;

    @Positive(message="Number of attendees must be over one.")
    private int numberOfAttendees;

    public Event(String name, String description, String contactEmail, String location, boolean attendantRegister, int numberOfAttendees) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        //this.attendantRegister = true;
        this.numberOfAttendees = numberOfAttendees;
        this.id = nextId;
        nextId++;
    }
    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAttendantRegister() {
        return attendantRegister;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
