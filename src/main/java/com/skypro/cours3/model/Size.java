package com.skypro.cours3.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Size {

    SMALL_36("36"),
    LITTLE_38("38"),
    MIDDLE_40("40"),
    BIG_43("43");

    private final String bySize;

    Size(String bySize) {
        this.bySize = bySize;
    }


    @JsonValue
    public String getBySize() {
        return bySize;
    }

    @JsonCreator
    public static Size fromBySize(String bySize) {
        for (Size type : Size.values()) {
            if (type.bySize.equals(bySize)) {
                return type;
            }
        }
        return null;
    }

}
