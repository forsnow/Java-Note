package com.xuesong.demo05USB;

public class demoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USB mouse = new Mouse();
        USB keyboards = new Keyboards();
        computer.useUSB(mouse);
        computer.useUSB(keyboards);
        computer.powerOff();
    }
}
