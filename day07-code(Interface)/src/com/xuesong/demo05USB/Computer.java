package com.xuesong.demo05USB;

public class Computer {
    public void powerOn() {
        System.out.println("Computer poweron");
    }

    public void powerOff() {
        System.out.println("Computer poweroff");
    }

    public void useUSB(USB usb) {
        usb.open();//打开设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboards) {
            Keyboards keyboards = (Keyboards) usb;
            keyboards.type();
        }
        usb.close();//关闭设备
    }
}
