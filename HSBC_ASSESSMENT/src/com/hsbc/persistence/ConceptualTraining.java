package com.hsbc.persistence;

import java.util.*;

public class ConceptualTraining implements Training {
    private int id;
    private String name;
    private List<Integer> skills;
    private Date startDate;
    private Date endDate;
// creating the construtor
    public ConceptualTraining(int id, String name, List<Integer> skills, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    // creating getters and setterss

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
    // to string method creating

	@Override
	public String toString() {
		return "ConceptualTraining [id=" + id + ", name=" + name + ", skills=" + skills + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
    
}
