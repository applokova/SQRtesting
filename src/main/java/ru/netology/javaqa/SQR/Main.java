package ru.netology.javaqa.SQR;

public class Main {
    public static void main(String[] args){
        SQRService service = new SQRService();
        System.out.println(service.calcSQR(200,300));
    }
}