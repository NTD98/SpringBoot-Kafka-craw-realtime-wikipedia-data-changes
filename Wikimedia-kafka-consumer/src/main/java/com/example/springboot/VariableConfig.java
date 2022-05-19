package com.example.springboot;

public enum VariableConfig {
    WIKIMEDIA_STREAM_URL("https://stream.wikimedia.org/v2/stream/recentchange"),
    WIKIPEDIA_RECENT_CHANGE_TOPIC("wikimedia_recent_change");
    private final String name;

    public String getName() {
        return name;
    }

    VariableConfig(String name) {
        this.name = name;
    }
}
