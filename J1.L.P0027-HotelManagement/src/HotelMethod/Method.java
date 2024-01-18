
package HotelMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Hotel;

public class Method {
   private static final File file = new File("src/resources/hotels.dat");
    public Hotel getHotelByLine(String line){
        String tokens[] = line.split(",");
                    String hotel_id = tokens[0];
                    String hotel_name = tokens[1];
                    int hotel_room_available = Integer.parseInt(tokens[2]);
                    String hotel_address = tokens[3];
                    String hotel_phone = tokens[4];
                    int hotel_rating = Integer.parseInt(tokens[5]);                    
                    Hotel hotel = new Hotel(hotel_id, hotel_name, hotel_address, hotel_phone, hotel_room_available, hotel_rating);
                    return hotel;
    }
    public ArrayList<Hotel> getHotels(File file) throws FileNotFoundException, IOException{
             ArrayList<Hotel> hotels = new ArrayList<>();
             BufferedReader reader = new BufferedReader(new FileReader(file)); 
                   String line = "";
             while((line = reader.readLine()) != null){
                   Hotel hotel = getHotelByLine(line);
                    hotels.add(hotel);
             }
                        //doc doan chuoi tu luong ki tu trong 1 file
                     return hotels;
    }
    
    public boolean add(File file, Hotel hotel){
        try{
        FileWriter writer = new FileWriter(file,true);
        writer.write(hotel.toString());
        writer.close();
        return true;
        }catch(IOException e){
            return false;
        }
        
    }
    public boolean updateHotel(File file, Hotel newHotel) throws IOException{
        File tmpFile = new File("src/source/tmp.dat");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        FileWriter writer = new FileWriter(tmpFile,true);
        while((line = reader.readLine()) != null){
            Hotel hotel = getHotelByLine(line);
            if(hotel.getHotel_id().equals(newHotel.getHotel_id())){
                hotel = newHotel;
            }
            writer.write(hotel.toString()+"\n");
        }
        reader.close();
          writer.close();
          file.delete();
          tmpFile.renameTo(file);
          return true;
    }
    
     public boolean deleteHotel(File file, String hotel_id) throws IOException{
        File tmpFile = new File("src/source/tmp.dat");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        FileWriter writer = new FileWriter(tmpFile);
        while((line = reader.readLine()) != null){
            Hotel hotel = getHotelByLine(line);
            if(hotel.getHotel_id().equals(hotel_id)){
                continue;
            }
            writer.write(hotel.toString()+"\n");
        }
          reader.close();
          writer.close();
          file.delete();
          tmpFile.renameTo(file);
          return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Method ht = new Method();
        File file = new File("src/source/Hotel.dat");
        Hotel newHotel = new Hotel("H03", "Minh moi", "thon 1 moi", "0981915357", 12, 12);
        System.out.println(ht.deleteHotel(file, "H03"));
        
    }
    
       public boolean insertHotel(Hotel hotel) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(hotel.toString() + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

public ArrayList<Hotel> getAllHotels() {
        ArrayList<Hotel> hotels = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                Hotel hotel = Hotel.fromString(line);
                hotels.add(hotel);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hotels;
    }
