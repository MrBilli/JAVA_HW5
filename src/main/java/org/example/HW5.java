package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class HW5 {
    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();
        String name;

        while (true) {
            HashSet<Integer> numbers = new HashSet<>();
            Scanner in = new Scanner(System.in);
            System.out.printf("Input a name or \"q\" to exit: ");
            name = in.nextLine();
            if (name.equals("q"))
                break;
            if (phoneBook.containsKey(name)) while (true) {
                System.out.printf("Input " + name + "'s phone number or \"q\" to exit: ");
                String number = in.nextLine();
                if (number.equals("q"))
                    break;
                phoneBook.get(name).add(Integer.parseInt(number));
            }
            else
                while (true) {
                    phoneBook.put(name, numbers);
                    System.out.printf("Input " + name + "'s phone number or \"q\" to exit: ");
                    String number = in.nextLine();
                    if (number.equals("q"))
                        break;
                    numbers.add(Integer.parseInt(number));
                }
        }

        HashMap<String, HashSet<Integer>> sortedPhoneBook;

        System.out.println(phoneBook);

        sortedPhoneBook = phoneBook.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue().size())).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

        System.out.println(sortedPhoneBook);
    }
}
