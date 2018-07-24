package com.kodilla.patterns.strategy.social;

class User {
    private final String username;
    private SocialPublisher socialPublisher;

    User(String username) {
        this.username = username;
    }

    void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", socialPublisher=" + socialPublisher +
                '}';
    }
}
