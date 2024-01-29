package com.example.dz3;

import org.springframework.stereotype.Service;

@Service
public class ProfileServiceMock implements ProfileService {

    @Override
    public Profile getProfile(int personId) {
        // имитируем обращение к БД
        if (personId == 1) {
            return new Profile(
                    personId,
                    "Роман",
                    "Москальченко"
            );
        }
        return null;
    }
}