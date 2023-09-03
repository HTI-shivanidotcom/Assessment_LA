package com.hsbc.persistence;

import java.util.Date;
import java.util.List;

public interface Training {
    int getId();
    String getName();
    List<Integer> getSkills();
    Date getStartDate();
    Date getEndDate();
}
