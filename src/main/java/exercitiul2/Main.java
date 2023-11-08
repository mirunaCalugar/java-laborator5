package exercitiul2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("C:\\lucru_java\\laboratror5\\src\\main\\resources\\perechenumere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<PerecheNumere> citire() {
        try {
            File file=new File("C:\\lucru_java\\laboratror5\\src\\main\\resources\\perechenumere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> perechi = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return perechi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<PerecheNumere>perechi=new ArrayList<PerecheNumere>();
//       perechi.add(new PerecheNumere(1,2));
//       perechi.add(new PerecheNumere(3,5));
//       perechi.add(new PerecheNumere(4,8));
//      scriere(perechi);

        List<PerecheNumere>perecheCitita=citire();

        perecheCitita.forEach(System.out::println);


    }
}
