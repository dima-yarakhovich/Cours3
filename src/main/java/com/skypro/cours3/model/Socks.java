package com.skypro.cours3.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class Socks {
    private final int cottonPart;
    private final Size size;
    private final Color color;


    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Socks(@JsonProperty("cottonPart") int cottonPart,
                 @JsonProperty("size") Size size,
                 @JsonProperty("color") Color color) {
        this.color = color;
        this.size = size;
        this.cottonPart = cottonPart;
    }
//
//    public Socks(int cottonPart, Size size, Color color) {
//        this.cottonPart = cottonPart;
//        this.size = size;
//        this.color = color;
//    }


    public int getCottonPart() {
        return cottonPart;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socks socks = (Socks) o;
        return cottonPart == socks.cottonPart && size == socks.size && color == socks.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cottonPart, size, color);
    }

    public Color getColor() {
        return color;
    }

}

