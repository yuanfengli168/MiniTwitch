package com.minitwitch.minitwitch.entity.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// why use builder inside another class?
public class Game {
    @JsonProperty("name")     // bug1: annotations not allowed here, caused by an extra ';' at the end.
    public String name;

    @JsonProperty("developer")
    private String developer;

    @JsonProperty("release_time")
    private String releaseTime;

    @JsonProperty("website")
    private String website;

    @JsonProperty("price")
    private double price;


    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getWebSite() {
        return website;
    }

    public double getPrice() {
        return price;
    }

    public Game(Builder builder) {
        this.name = builder.name;
        this.developer = builder.developer;
        this.releaseTime = builder.releaseTime;
        this.website = builder.website;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private String developer;
        private String releaseTime;
        private String website;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;  // why return this here??
        }

        public Builder setReleaseTime(String releaseTime) {
            // immutable objects?
            this.releaseTime = releaseTime;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
