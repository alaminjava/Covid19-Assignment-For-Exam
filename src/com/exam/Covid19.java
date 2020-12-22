/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author shahidur
 */
public class Covid19 {

    String province[] = {"Connaught", "Munster", "Leinster", "Leinster2"};
    String ConnaughtCounty[];
    int ConnaughtCountyNewCase[];
    String MunsterCounty[];
    int MunsterCountyNewCase[];
    String LeinsterCounty[];
    int LeinsterCountyNewCase[];
    String Leinster2County[];
    int Leinster2CountyNewCase[];

    public static void main(String[] args) {
        try {
            Covid19 c19 = new Covid19();
            System.out.print("Type one province and press enter: ");
            System.out.println("Connaught, " + "Munster, " + "Leinster, " + "Leinster2" + "\n");
            Scanner sc = new Scanner(System.in);
            String prov = "";
            prov = sc.nextLine().toLowerCase();
            switch (prov) {
                case "connaught": {
                    String[] countyName = c19.ConnaughtCounty;
                    int[] countyNewCase = c19.ConnaughtCountyNewCase;
                    System.out.println("Enter number. How many counties in " + prov + " province?(for example 5)");
                    int countyNum = Integer.parseInt(sc.nextLine().toLowerCase());
                    countyName = new String[countyNum];
                    countyNewCase = new int[countyNum];
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter String. County Name (for example galway" + i + ")");
                        countyName[i] = sc.nextLine().toLowerCase();
                    }
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter Number new cases of COVID19 in " + countyName[i] + " (for example 10)");
                        countyNewCase[i] = Integer.parseInt(sc.nextLine().toLowerCase());
                    }
                    System.out.println();
                    System.out.println("The Avaverage number of new cases in " + countyNum + " counties is: " + c19.averageCase(countyNewCase));
                    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                    for (int i = 0; i < countyNum; i++) {
                        treeMap.put(countyNewCase[i], countyName[i]);
                    }
                    Map x = c19.max(treeMap);
                    System.out.println();
                    System.out.println("The largest number of new cases: " + x.keySet() + " in " + x.values().toArray()[0] + " county.");
                    Map y = c19.min(treeMap);
                    System.out.println();
                    System.out.println("The smallest number of new cases: " + y.keySet() + " in " + y.values().toArray()[0] + " county.");
                    System.out.println();
                    c19.sortAndDisplay(treeMap);
                    System.out.println();
                    System.out.println("Enter String county name for search");
                    String serchString = sc.nextLine().toLowerCase();
                    int index = searchCounty(countyName, serchString);
                    System.out.println("county :" + serchString + " has new case :" + countyNewCase[index]);
                    break;
                }
                case "munster": {
                    String[] countyName = c19.ConnaughtCounty;
                    int[] countyNewCase = c19.ConnaughtCountyNewCase;
                    System.out.println("Enter number. How many counties in " + prov + " province?(for example 5)");
                    int countyNum = Integer.parseInt(sc.nextLine().toLowerCase());
                    countyName = new String[countyNum];
                    countyNewCase = new int[countyNum];
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter String. County Name (for example galway" + i + ")");
                        countyName[i] = sc.nextLine().toLowerCase();
                    }
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter Number new cases of COVID19 in " + countyName[i] + " (for example 10)");
                        countyNewCase[i] = Integer.parseInt(sc.nextLine().toLowerCase());
                    }
                    System.out.println();
                    System.out.println("The Avaverage number of new cases in " + countyNum + " counties is: " + c19.averageCase(countyNewCase));
                    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                    for (int i = 0; i < countyNum; i++) {
                        treeMap.put(countyNewCase[i], countyName[i]);
                    }
                    Map x = c19.max(treeMap);
                    System.out.println();
                    System.out.println("The largest number of new cases: " + x.keySet() + " in " + x.values().toArray()[0] + " county.");
                    Map y = c19.min(treeMap);
                    System.out.println();
                    System.out.println("The smallest number of new cases: " + y.keySet() + " in " + y.values().toArray()[0] + " county.");
                    System.out.println();
                    c19.sortAndDisplay(treeMap);
                    System.out.println();
                    System.out.println("Enter String county name for search");
                    String serchString = sc.nextLine().toLowerCase();
                    int index = searchCounty(countyName, serchString);
                    System.out.println("county :" + serchString + " has new case :" + countyNewCase[index]);
                    break;
                }
                case "leinster": {
                    String[] countyName = c19.ConnaughtCounty;
                    int[] countyNewCase = c19.ConnaughtCountyNewCase;
                     System.out.println("Enter number. How many counties in " + prov + " province?(for example 5)");
                    int countyNum = Integer.parseInt(sc.nextLine().toLowerCase());
                    countyName = new String[countyNum];
                    countyNewCase = new int[countyNum];
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter String. County Name (for example galway" + i + ")");
                        countyName[i] = sc.nextLine().toLowerCase();
                    }
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter Number new cases of COVID19 in " + countyName[i] + " (for example 10)");
                        countyNewCase[i] = Integer.parseInt(sc.nextLine().toLowerCase());
                    }
                    System.out.println();
                    System.out.println("The Avaverage number of new cases in " + countyNum + " counties is: " + c19.averageCase(countyNewCase));
                    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                    for (int i = 0; i < countyNum; i++) {
                        treeMap.put(countyNewCase[i], countyName[i]);
                    }
                    Map x = c19.max(treeMap);
                    System.out.println();
                    System.out.println("The largest number of new cases: " + x.keySet() + " in " + x.values().toArray()[0] + " county.");
                    Map y = c19.min(treeMap);
                    System.out.println();
                    System.out.println("The smallest number of new cases: " + y.keySet() + " in " + y.values().toArray()[0] + " county.");
                    System.out.println();
                    c19.sortAndDisplay(treeMap);
                    System.out.println();
                    System.out.println("Enter String county name for search");
                    String serchString = sc.nextLine().toLowerCase();
                    int index = searchCounty(countyName, serchString);
                    System.out.println("county :" + serchString + " has new case :" + countyNewCase[index]);
                    break;
                }
                case "leinster2": {
                    String[] countyName = c19.ConnaughtCounty;
                    int[] countyNewCase = c19.ConnaughtCountyNewCase;
                     System.out.println("Enter number. How many counties in " + prov + " province?(for example 5)");
                    int countyNum = Integer.parseInt(sc.nextLine().toLowerCase());
                    countyName = new String[countyNum];
                    countyNewCase = new int[countyNum];
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter String. County Name (for example galway" + i + ")");
                        countyName[i] = sc.nextLine().toLowerCase();
                    }
                    for (int i = 0; i < countyNum; i++) {
                        System.out.println("Enter Number new cases of COVID19 in " + countyName[i] + " (for example 10)");
                        countyNewCase[i] = Integer.parseInt(sc.nextLine().toLowerCase());
                    }
                    System.out.println();
                    System.out.println("The Avaverage number of new cases in " + countyNum + " counties is: " + c19.averageCase(countyNewCase));
                    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                    for (int i = 0; i < countyNum; i++) {
                        treeMap.put(countyNewCase[i], countyName[i]);
                    }
                    Map x = c19.max(treeMap);
                    System.out.println();
                    System.out.println("The largest number of new cases: " + x.keySet() + " in " + x.values().toArray()[0] + " county.");
                    Map y = c19.min(treeMap);
                    System.out.println();
                    System.out.println("The smallest number of new cases: " + y.keySet() + " in " + y.values().toArray()[0] + " county.");
                    System.out.println();
                    c19.sortAndDisplay(treeMap);
                    System.out.println();
                    System.out.println("Enter String county name for search");
                    String serchString = sc.nextLine().toLowerCase();
                    int index = searchCounty(countyName, serchString);
                    System.out.println("county :" + serchString + " has new case :" + countyNewCase[index]);
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double averageCase(int[] a) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        avg = sum / a.length;
        return avg;
    }

    public <K, V> Map max(Map<K, V> map) {
        int[] nc = new int[map.size()];
        String[] county = new String[map.size()];
        int size = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            nc[size] = Integer.valueOf(entry.getKey().toString());
            county[size] = entry.getValue().toString();
            size++;
        }
        Map m = new HashMap();
        m.put(nc[size - 1], county[size - 1]);
        return m;
    }

    public <K, V> Map min(Map<K, V> map) {
        int[] nc = new int[map.size()];
        String[] county = new String[map.size()];
        int size = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            nc[size] = Integer.valueOf(entry.getKey().toString());
            county[size] = entry.getValue().toString();
            size++;
        }
        Map m = new HashMap();
        m.put(nc[0], county[0]);
        return m;
    }

    public <K, V> void sortAndDisplay(Map<K, V> map) {
        int[] nc = new int[map.size()];
        String[] county = new String[map.size()];
        int size = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            nc[size] = Integer.valueOf(entry.getKey().toString());
            county[size] = entry.getValue().toString();
            size++;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println("New Case : " + nc[i] + "  in, County : " + county[i]);
        }
    }

    private static int searchCounty(String[] arr, String toCheckValue) {
        boolean test = false;
        int index = -1;
        for (String element : arr) {
            if (element.equals(toCheckValue)) {
                test = true;
                index++;
                break;
            } else {
                index++;
            }
        }
        return index;
    }
}
