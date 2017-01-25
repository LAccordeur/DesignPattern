package com.guoyang.proxy.protect;

/**
 * Created by L'Accordeur on 2017/1/22.
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        } else {
            return (rating/ratingCount);
        }
    }

    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

}
