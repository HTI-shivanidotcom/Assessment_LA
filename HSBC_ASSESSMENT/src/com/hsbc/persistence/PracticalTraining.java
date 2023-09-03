package com.hsbc.persistence;

import java.util.*;

public class PracticalTraining implements Training {
    private int id;
    private String name;
    private List<Integer> skills;
    private Date startDate;
    private Date endDate;
    private int labDuration;
// creating constructors
    public PracticalTraining(int id, String name, List<Integer> skills, Date startDate, Date endDate, int labDuration) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.startDate = startDate;
        this.endDate = endDate;
        this.labDuration = labDuration;
    }
    
    // creating getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getSkills() {
        return skills;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
