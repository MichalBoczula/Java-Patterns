package com.kodilla.patterns.strategy.social;

class Millenials extends User {
    Millenials(String username) {
        super(username);
        setSocialPublisher(new FacebookPublisher());
    }
}
