package ru.netology.javaqa.SQR;

public class SQRService {
    public int calcSQR(int rangeFrom, int rangeUpTo) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= rangeFrom & i*i <= rangeUpTo) {
                count++;

            }
        }
        return count;
    }
}
