package com.tfg.gestionong.model;

public class Activity {

    private int id;

    private String title;

    private String description;

    private String location;

    private String activityDate;

    private int maxParticipants;

    public enum Category {
        social, ambiental, educativa, salud
    }

    private enum Status {
        programada, en_curso, finalizada, cancelada;
    }
}

