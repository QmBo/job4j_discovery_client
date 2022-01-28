package ru.job4j.discovery.model;

public class Message {
    private int id;
    private String message;
    private String sender;

    public int getId() {
        return id;
    }

    public Message setId(int id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public Message setSender(String sender) {
        this.sender = sender;
        return this;
    }
}
