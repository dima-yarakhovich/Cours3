package com.skypro.cours3.dto;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.skypro.cours3.model.Color;
import com.skypro.cours3.model.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class SimilarSocks {
    private int cottonPart;
    private Size size;
    private Color color;
    private int quantity;

    public int getCottonPart() {
        return cottonPart;
    }


    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }



}
