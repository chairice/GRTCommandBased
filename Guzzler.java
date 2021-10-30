// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

/** Add your docs here. */
public class Guzzler {
    static int count = 0;
    private static int counter() {
            count++;
            System.out.println("counter function working");
            System.out.println (count);
            return count;
        }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            counter();
    }    
}
}    
