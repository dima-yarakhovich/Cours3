package com.skypro.cours3.service;

import com.skypro.cours3.model.Color;
import com.skypro.cours3.dto.SimilarSocks;
import com.skypro.cours3.model.Size;

import java.util.Map;

public interface SockService {

    Map addSock(SimilarSocks similarSocks);

    void realization(SimilarSocks similarSocks);

    int getAllQuantity(Color color, Size size, Integer cottonMin, Integer cottonMax);
}
