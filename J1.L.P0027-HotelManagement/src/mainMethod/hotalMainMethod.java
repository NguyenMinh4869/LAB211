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
public class hotalMainMethod  implements hotelMainMethod{
    
    private hotelMainMethod hotelMainMethod;
    @Override
    public Hotel inputHotel() {
        String hotel_id = inputHotel().getHotel_id();
        String hotel_name = inputHotel().getHotel_name();
        int hotel_room_available = inputHotel().getHotel_room_available();
        String hotel_address = inputHotel().getHotel_address();
        String hotel_phone = inputHotel().getHotel_phone();
        int hotel_rating = inputHotel().getHotel_rating();
        Hotel hotel = new Hotel(hotel_id, hotel_name, hotel_address, hotel_phone, hotel_room_available, hotel_rating);
        return hotel;
    }

    @Override
    public void addHotel() {
        boolean agreed = false;
        do{
            Hotel hotel = inputHotel();
            boolean result = hotelMainMethod.addHotel();
            if(result){
                System.out.println("Add succesfull");
            }else{
                System.out.println("add failse");
            }
            agreed = inputHandle
        }
    }

    @Override
    public void searchHotel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateHotel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteHotel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchHotelById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchHotelByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayHotels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
