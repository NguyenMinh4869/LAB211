
package untils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyTool {
    public static final Scanner sc = new Scanner(System.in);
    //target: parsing the input string to get a boolean data (t/f)
    //xu li boolean
    public static boolean parseBoolean(String input){
        input = input.trim().toUpperCase();
        char c = input.charAt(0);//lay ki tu dau cua chuoi nhap
        return c == 'T' || c == '1' || c =='Y'; // tra ve true neu ky tu la T 1 Y
    }
    
    //target: normalizing a date string: using '-; to seperate parts only
    public static String normalizeDateStr(String dateStr){
        String rs = dateStr.replaceAll("[\\s]+", "");
        //thay the tat ca cac nhom ki tu bang "-", dung replaeAll voi regex
        rs = rs.replaceAll("[./-]+", "-");
        return rs;
    } 
    
    public static Date parseDate(String inputStr, String dateFormat){
        inputStr = normalizeDateStr(inputStr);
        DateFormat formmater = new SimpleDateFormat(dateFormat);
        try {
            return formmater.parse(inputStr);
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }
    
    public static int getPart(Date d, int calendarPart){
        Calendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(calendarPart);
    }
    
    /*
    method for reading data
    #1 reading a boolean data
    */
    
    public static boolean readBolean(String prompt){
        System.out.println(prompt + ":");
        return parseBoolean(sc.nextLine());
    }
    
    /*
    reading a string using predfline pattern
    */
    public static String readStr(String prompt, String pattern){
        String input;
        boolean valid = false;
        do{
            //khong dung voi pattern -> valid -> true
            System.out.println(prompt +":");
            input= sc.nextLine();
            valid = input.matches(pattern);
        }while(!valid);
        return input;
    }
    
    /*
    reading a date using predefined date format
    */
    public static Date readDate(String prompt, String dateFormart){
        String input;
        Date rs;
        //parseDate : ep kieu
        do{
            //yeu cau ng dung nhap vao
            System.out.println(prompt+ ":");
            //chuyen du lieu sau sang dang date theo dateFormat
            input = sc.nextLine();
            //neu date null : khong hop le1
            rs=parseDate(input,dateFormart);
            if(rs == null)  System.err.println("date data is not valid");
        }while(rs == null);
        return rs;
    }
    
    public static Date readDateAfter(String prompt, String dateFormat, Date givenDate){
         String input;
        Date rs;
        boolean valid = false;
        //parseDate : ep kieu
        do{
            //yeu cau ng dung nhap vao
            System.out.println(prompt+ ":");
            //chuyen du lieu sau sang dang date theo dateFormat
            input = sc.nextLine();
            //neu date null : khong hop le1
            rs=parseDate(input,dateFormat);
            //so sanh 2 date voi nhau va kiem tra dinh dang
            valid = (rs != null && rs.after(givenDate));
            if(rs == null)  System.err.println("date data is not valid");
        }while(!valid);
        return rs;
    }
    
        public static Date readDateBefore(String prompt, String dateFormat, Date givenDate){
         String input;
        Date rs;
        boolean valid = false;
        //parseDate : ep kieu
        do{
            //yeu cau ng dung nhap vao
            System.out.println(prompt+ ":");
            //chuyen du lieu sau sang dang date theo dateFormat
            input = sc.nextLine();
            //neu date null : khong hop le1
            rs=parseDate(input,dateFormat);
            //so sanh 2 date voi nhau va kiem tra dinh dang
            valid = (rs != null && rs.before(givenDate));
            if(rs == null)  System.err.println("date data is not valid");
        }while(!valid);
        return rs;
    }
        
        /*
        auto generate code
        */
        //ds hoc sinh, moi hoc sinh co 1 code khac nhau ung voi n
        //thi se co code : S000
        //printf(dinh danh (), bien)
        public static String generateCode(String prefix, int length, int curSize){
            String format = "%0" +length + "d"; //%07d
            return prefix + String.format(format, curSize);
        }
    
    public static void main(String[] args) {
        System.out.println("Normalize date str: " + normalizeDateStr("7.... ---2 ///// 2023"));
        Date newDate = parseDate("26... --- 5 /// 2023", "dd/MM/yyy");
    }
    
    public static int readInt(String promp, int min, int max) {
        while(true){
            System.out.println(promp + ": ");
            String inputStr = sc.nextLine();
            try{
                double number = Double.parseDouble(inputStr);
                if(number < min || number > max){
                    System.out.println("number must from" + min +" to"+ max);
                }
            }catch(NumberFormatException e){
                System.err.println(" Number error");
            }
            int number = Integer.parseInt(inputStr);
                    //chuyen chuoi sang so
        }
    }

}

