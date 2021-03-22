package com.company;

public class Main {

    public static void main(String[] args) {
       /* 1) Класс "Car" представляет собой автомобиль.
                Имеет следующие свойства:
                * Цвет
                * Модель (неизменяемая)
                * Год выпуска (неизменяемый)
                * Размер колес
                * Обьем двигателя (неизменяемая)
                * Список опций (Могут быть, а могут и нет)
        Автомобилю можно:
        * Сменить свет
        * Сменить размер колес
        * Изменять список опций (Добавлять\Удвлять)
        Ожидается возможность вывода на экран информации об автомобиле.*/

                String color = "Blue";
                final String MODEL = " X";
                final int YEAR = 2021;
                int wheel_size = 19;
                final double ENGINE_VOLUME = 1.9;
                String transmission = "Automatic";
                int horsepower = 210;

                System.out.println("Car: " + MODEL + " " + color + " " + transmission);
            }
        }
