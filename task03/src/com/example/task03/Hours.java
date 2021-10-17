package com.example.task03;

public class Hours implements TimeUnit {
    private final long amount;

    public Hours(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("hours can't be negative");
        }
        this.amount = amount;
    }

    @Override
    public long toHours() {
        return amount;
    }

    @Override
    public long toMinutes() {
        return amount * 60;
    }

    @Override
    public long toSeconds() {
        return amount * 60*60;
    }

    @Override
    public long toMillis() {
        return amount * 60*60*1000;
    }
}