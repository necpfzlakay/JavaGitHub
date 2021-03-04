package newests;
import org.json.*;
import java.io.*;
import java.util.ArrayList;


public class LastEarthquakes {
    public static void main(String[] args) {
        newest();
    }

    public static void newest(){


        String str;
        String[] arrays;
        ArrayList<String> yer = new ArrayList<>();
        ArrayList<String> enlem = new ArrayList<>();
        ArrayList<String> boylam = new ArrayList<>();
        ArrayList<String> derinlik = new ArrayList<>();
        ArrayList<String> siddet = new ArrayList<>();
        ArrayList<String> tarih = new ArrayList<>();
        ArrayList<String> saat = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("lastEqarthquakes.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            str = bufferedReader.readLine();
            arrays = str.split("},\\{");
            for (Object i: arrays ) {

                //System.out.println("{" +i + "}");
                String first = "lastEqarthquakes.txt";
                JSONObject json =  new JSONObject("{"+i+"}");

                yer.add(json.getString("yer"));
                enlem.add(json.getString("enlem"));
                boylam.add(json.getString("boylam"));
                derinlik.add(json.getString("derinlik"));
                siddet.add(json.getString("siddet"));
                tarih.add(json.getString("boylam"));
                saat.add(json.getString("tarih"));
            }
            for (int i = 0; i<arrays.length;i++){
                System.out.println("-----------");
                System.out.println("Place: " +yer.get(i));
                System.out.println("Latitude: " +enlem.get(i));
                System.out.println("Longitude: "+boylam.get(i));
                System.out.println("Depth: "+derinlik.get(i));
                System.out.println("Intensity: "+siddet.get(i));
                System.out.println("Date: "+tarih.get(i));
                System.out.println("Hour: "+saat.get(i));
                System.out.println("-----------");

            }
        }catch (Exception e){
            System.err.println(e);
        }
    }
}




