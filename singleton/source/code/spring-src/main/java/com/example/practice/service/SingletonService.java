package com.example.practice.service;

public class SingletonService {
    private static SingletonService instance = null;

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    public void logic() {
        System.out.println("called singleton");
    }
}