package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Estudiante;
import cr.ac.ucenfotec.tarea3.bl.entidades.Material;
import cr.ac.ucenfotec.tarea3.bl.entidades.Persona;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AdministrativoFAO extends PersonaFAO{

    @Override
    public boolean save(Persona nuevaPersona) {

        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevaPersona.toCSVLine());
        try {
            Files.write(Paths.get("/Users/dfrz/Documents/testFiles/listaDePersona.csv"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Persona> findAll() {
        ArrayList<Persona> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/dfrz/Documents/testFiles/listaDePersona.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Estudiante(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
