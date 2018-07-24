package com.kodilla.patterns.strategy.social;

class YGeneration extends User {

    YGeneration(String username) {
        super(username);
        setSocialPublisher(new SnapchatPublisher());
    }
}
