package com.pluralsight.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        List<Integer> ageList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        nameList.add("Micheal Scott");
        ageList.add(40);

        nameList.add("Michel of the Angelo Variety");
        ageList.add(88);

        nameList.add("Micheal Bay");
        ageList.add(58);

        nameList.add("Micheal Myers");
        ageList.add(31);

        nameList.add("Micheal Caine");
        ageList.add(90);

        nameList.add("Micheal Jackson");
        ageList.add(50);

        nameList.add("Micheal Jordan");
        ageList.add(60);

        nameList.add("Micheal Cera");
        ageList.add(35);

        nameList.add("Micheal of the Magic Variety");
        ageList.add(40);

        nameList.add("Micheal Phelps");
        ageList.add(38);


        System.out.println("List of Micheals and their ages :");
        for (int i =0;i <nameList.size();i++ ) {
            System.out.println(nameList.get(i) + ":" + ageList.get(i) + " years old");
        }
        Scanner search = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = search.nextLine();

        List<String> matchingNames = new ArrayList<>();


        for (String name : nameList) {
            if (name.toLowerCase().contains(searchName.toLowerCase())) {
                matchingNames.add(name);
            }
        }


        System.out.println("\nHere is your Micheal! :");
        if (matchingNames.isEmpty()) {
            System.out.println("There no Micheals of that kind here!");
        } else {
            for (String matchingName : matchingNames) {
                System.out.println(matchingName);
            }
        }
        double averageAge = calculateAverageAge(ageList);
        System.out.println("\nAverage Age: " + averageAge + " years");

        String youngest = findYoungest(nameList,ageList);
        String oldest = findOldest(nameList,ageList);
        System.out.println("\nYoungest: " + youngest);
        System.out.println("Oldest: " + oldest);


        search.close();
    }
        private static double calculateAverageAge(List<Integer>ages) {
            if (ages.isEmpty()) {
                return 0;
            }
        int sum = 0;
         for(int age : ages){
             sum += age;
         }
       return (double) sum /ages.size();

        }
    private static String findYoungest(List<String> names, List<Integer> ages) {
        int minAge = Integer.MAX_VALUE;
        String youngest = "";

        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) < minAge) {
                minAge = ages.get(i);
                youngest = names.get(i);
            }
        }
        return youngest;
    }
    private static String findOldest(List<String> names, List<Integer> ages) {
        int maxAge = Integer.MIN_VALUE;
        String oldest = "";

        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) > maxAge) {
                maxAge = ages.get(i);
                oldest = names.get(i);
            }
        }

        return oldest;
    }

}
