package com.spring.core;

import com.spring.core.chap01.Hotel;
import com.spring.core.chap01.HotelManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotel() {

        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();
        hotel.reserve();
    }

}