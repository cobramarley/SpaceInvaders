package com.example.hectormediero.spaceinvadersdas.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BulletTest {

    Bullet bullet;

    @Before
    public void setup(){
        bullet = new Bullet(0);
    }

    @Test
    public void shoot() {
        bullet.shoot(0,0,1);
        assertEquals(bullet.getStatus(),true);
    }

    @Test
    public void changeDirection() {
        bullet.changeDirection(-1);
        assertEquals(bullet.heading,-1);
    }
}