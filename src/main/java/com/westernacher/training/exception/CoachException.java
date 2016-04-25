package com.westernacher.training.exception;

import com.westernacher.training.model.Coach;

public class CoachException extends RuntimeException {

    private Coach coach;

    public CoachException(String message, Coach coach) {
        super(message);
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
