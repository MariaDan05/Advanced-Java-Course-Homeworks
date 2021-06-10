import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Task: Serialization and deserialization using XML:" + "\n");

        System.out.println("Serialize Java object Student into the XML String:");
        List<Pet> pets = new ArrayList<>(Arrays.asList(new Pet("dog"), new Pet("cat")));
        Student student = new Student("Nick", "Jackson", 90.5, pets);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = null;
        try {
            xml = xmlMapper.writeValueAsString(student);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(xml + "\n");

        //Serialize Java object Student to the XML File
        try {
            xmlMapper.writeValue(new File("student.xml"), student);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Deserialize Java object Student From the XML File:");
        File file = new File("student.xml");
        Student student1 = null;
        try {
            String xmlFormat = InputStreamToStringService.inputStreamToString(new FileInputStream(file));
            student1 = xmlMapper.readValue(xmlFormat, Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Last name of the student is: " + student1.getLastName() + "\n");

        System.out.println("Deserialize Java object Student From the XML String:");
        String s = "<Student xmlns=\"\"><firstName>Nick</firstName><lastName>Jackson</lastName><grade>90.5</grade><pets><pets><type>dog</type></pets><pets><type>cat</type></pets></pets></Student>";
        Student student2 = null;
        try {
            student2 = xmlMapper.readValue(s, Student.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("First name of the student is: " + student2.getFirstName());
        System.out.println("Grade of the student is: " + student2.getGrade());
        System.out.println(student2.getPets());
    }

}
