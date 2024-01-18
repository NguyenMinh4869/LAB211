/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainMethod;

import model.Hotel;

/**
 *
 * @author marco
 */
public interface hotelMainMethod {
    public Hotel inputHotel();

    public void addHotel();

    public void searchHotel();

    public void updateHotel();

    public void deleteHotel();

    public void searchHotelById();

    public void searchHotelByName();

    public void displayHotels();
}
