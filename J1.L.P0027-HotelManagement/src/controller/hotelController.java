/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import HotelMethod.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Hotel;

/**
 *
 * @author marco
 */
public class hotelController {
    private Method method;

    public hotelController(Method method) {
        this.method = method;
    }
    
   public ArrayList<Hotel> getAllHotels() {
        // sort by hotel name descending
        Comparator<Hotel> hotelNameComparator = Comparator.comparing(Hotel::getHotel_name);
        ArrayList<Hotel> hotels = method.getAllHotels();
        Collections.sort(hotels, hotelNameComparator);
        return hotels;
    }
   
   public boolean addHotel(Hotel hotel) {
        return method.insertHotel(hotel);
    }
}
