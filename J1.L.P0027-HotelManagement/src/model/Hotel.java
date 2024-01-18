
package model;


public class Hotel {
    private String hotel_id, hotel_name, hotel_address, hotel_phone;
    private int hotel_room_available,hotel_rating;
    
    public Hotel(){
        
    }

    public Hotel(String hotel_id, String hotel_name, String hotel_address, String hotel_phone, int hotel_room_available, int hotel_rating) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_phone = hotel_phone;
        this.hotel_room_available = hotel_room_available;
        this.hotel_rating = hotel_rating;
    }
    
    //getter & setter

    public String getHotel_id() {
        return hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public String getHotel_phone() {
        return hotel_phone;
    }

    public int getHotel_room_available() {
        return hotel_room_available;
    }

    public int getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public void setHotel_phone(String hotel_phone) {
        this.hotel_phone = hotel_phone;
    }

    public void setHotel_room_available(int hotel_room_available) {
        this.hotel_room_available = hotel_room_available;
    }

    public void setHotel_rating(int hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    @Override
    public String toString() { // ghi de` tostring cua class obj
       return hotel_id +"," + hotel_name +","+ hotel_room_available +","+ hotel_address+","+hotel_phone+","+hotel_rating;
    }
    
    
}
    
    
