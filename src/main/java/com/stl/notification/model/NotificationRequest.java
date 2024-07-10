package com.stl.notification.model;

public class NotificationRequest {

    private String title;
    private String body;
    private String topic;
    private String token;

    public NotificationRequest(String title, String body, String topic, String token){
        this.title = title;
        this.body = body;
        this.topic = topic;
        this.token = token;
    }
    public String getToken() {
        return token;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
