package task1_numbers;

import java.util.*;

public class NumbersTask {

    private DataHandlerTask1 dataHandler;

    public NumbersTask() {
        dataHandler = new DataHandlerTask1();
    }

    /**
     * Példafeladat.
     * A fájl beolvasását végző metódus helyes megírása után a beolvasott adatok így érhetőek el.
     * A dataHandler.getNumbers() elvégzi a beolvasást, ha a lista még üres - lásd ott.
     */
    public void numbersFromFile() {
        List<Integer> numbers = dataHandler.getNumbers();

        System.out.println("A fájl tartalma:");

        int i = 0;
        for (; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i) + ", ");
        }

        System.out.println(numbers.get(i));
    }

    /**
     * Add össze a fájlból beolvasott számokat!
     */
    public int sum() {
        int sum = 0;

        for (int numb : dataHandler.getNumbers()) {
            sum += numb;
        }
        return sum;
    }

    /**
     * Mekkora a fájlból beolvasott számok átlaga? Számítsd ki!
     */
    public double avg() {
        int sum = 0;

        for (int numb : dataHandler.getNumbers()) {
            sum += numb;
        }

        return (double) sum / dataHandler.getNumbers().size();
    }

    /**
     * Hány különböző számjegyből áll az a szám, amely a beolvasott számokat tartalmazó lista adott indexén szerepel?
     * Számold össze, és térj vissza a megoldással!
     */
    public int countDifferentDigits(int index) {

        Set<Integer> ayy = new HashSet<>();
        int ayyi;

        if (dataHandler.getNumbers().get(index) < 0) {
             ayyi = dataHandler.getNumbers().get(index) * -1;
        } else ayyi = dataHandler.getNumbers().get(index);
        String stringAyy = String.valueOf(ayyi);

        for (int i = 0; i < stringAyy.length(); i++) {
            ayy.add((int) stringAyy.charAt(i))     ;
        }

         return ayy.size();
    }

    /**
     * Hányszor szerepel az adott számjegy az összes számban?
     * Számold össze, és térj vissza a megoldással!
     */
    public int countDigit(int digit) {

        List<Character> ayyChar = new ArrayList<>();
        String newting = String.valueOf(dataHandler.getNumbers());
        String[] parts = newting.split(",");
        int counter = 0;

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                ayyChar.add(parts[i].charAt(j));
            }
        }

        for (Character charsie : ayyChar) {
            if (digit == Character.getNumericValue(charsie)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Hányszor szerepel az összes számjegy az összes számban?
     * Számold össze, és térj vissza a megoldással!
     */
    public Map<Integer, Integer> countAllDigits() {

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            numbers.put(i,countDigit(i));
        }
        return numbers;
    }

}
