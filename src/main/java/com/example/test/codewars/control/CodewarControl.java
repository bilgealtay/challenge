package com.example.test.codewars.control;

import org.springframework.stereotype.Component;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;

/**
 * Created by bilga on 10-12-2020
 */
@Component
public class CodewarControl {

    public String pigIt(String str) {
        //
        // return str.replaceAll("(\\w)(\\w*)", "$2$1ay");

        //Regular expression to match lower case letters
        String regex = "^\\p{Punct}+$";
        Pattern p = Pattern.compile(regex);

        String[] splitStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String item : splitStr) {
            Matcher m = p.matcher(item);
            if (!m.matches()) {
                char firstLetter = item.charAt(0);
                sb.append(item.substring(1));
                sb.append(firstLetter);
                sb.append("ay");
            } else {
                sb.append(item);
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public String aa(String str){
        str = "Ptpora o mores [!]";
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static List<String> strPerm(String str, List<String> list) {
        int len = str.length();
        if(len == 1){
            list.add(str);
            return list;
        }

        list = strPerm(str.substring(0,len-1),list);

        int ls = list.size();
        char ap = str.charAt(len-1);

        for(int i=0; i<ls ;i++){
            String temp = list.get(i);
            int tl = temp.length();

            for(int j=0; j<=tl; j++){
                list.add(temp.substring(0,j)+ap+temp.substring(j,tl));
            }
        }

        while(true){
            String temp = list.get(0);
            if(temp.length()<len)
                list.remove(temp);
            else
                break;
        }

        return list;
    }



    public static void printAllRecursive(int n, char[] elements, List<String> list) {

        if(n == 1) {
            if (!list.contains(String.valueOf(elements))){
                list.add(String.valueOf(elements));
            }
        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, list);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, list);
        }
    }

    private static void swap(char[] input, int a, int b) {
        char tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public Long coderByte(String data){

        data = data.substring(9, data.length() - 2);
        String[] splitStr = data.split(", ");

        List<String> res = Arrays.asList(splitStr).stream().filter(p -> p.contains("age")).collect(Collectors.toList());
        List<Integer> ageList = res.stream().map(item -> Integer.valueOf(item.split("=")[1])).collect(Collectors.toList());

        Map<Boolean, Long> ageMap = ageList.stream().collect( Collectors.groupingBy(s -> s >= 50,  Collectors.counting()));

        ageMap.get(true);


        return ageMap.get(true);
    }

    public Long beezapps(String data){

        data = data.substring(9, data.length() - 2);
        String[] splitStr = data.split(", ");

        List<String> res = Arrays.asList(splitStr).stream().filter(p -> p.contains("age")).collect(Collectors.toList());
        List<Integer> ageList = res.stream().map(item -> Integer.valueOf(item.split("=")[1])).collect(Collectors.toList());

        Map<Boolean, Long> ageMap = ageList.stream().collect( Collectors.groupingBy(s -> s >= 50,  Collectors.counting()));

        ageMap.get(true);


        return ageMap.get(true);
    }

    public static double average(int a, int b) {
        return (a + b) / 2;
    }

    public static class TextInput {
        StringBuilder str = new StringBuilder();
        public void add(char c){
            str = str.append('c');
        }

        public String getValue(){
            return str.toString();
        }
    }

    public static class NumericInput extends TextInput{
        @Override
        public void add(char c){
            if (Character.isDigit(c)){
                super.add(c);
            }
        }
    }

    /*public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }*/

    public static Collection<String> folderNames(String xml, char startingLetter) {
        List<String> strList = new ArrayList<>();
        try {
            DocumentBuilderFactory dbf =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("folder");

            // iterate the employees
            for (int i = 0; i < nodes.getLength(); i++) {
                Element element = (Element) nodes.item(i);

                NodeList name = element.getElementsByTagName("name");
                Element line = (Element) name.item(0);
                String folderName = getCharacterDataFromElement(line);
                if (folderName.startsWith(Character.toString(startingLetter))){
                    strList.add(folderName);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        return strList;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";
        System.out.println(xml);
        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";
    }

}
