package com.nt.test;


// Represents an Activity with a name and schedule
class Activity {
    private String name;
    private String schedule;

    // Constructor to initialize the activity's details
    public Activity(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    // Getters for name and schedule
    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    // Override toString() to return a string representation of the activity
    @Override
    public String toString() {
        return name + " (" + schedule + ")";
    }
}

