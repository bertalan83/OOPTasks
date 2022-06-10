package task2_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ProgrammingTask {

    private DataHandlerTask2 dataHandler;

    public ProgrammingTask() {
        dataHandler = new DataHandlerTask2();
    }

    /**
     * Példafeladat.
     * A fájl beolvasását végző metódus helyes megírása után a beolvasott adatok így érhetőek el.
     * A dataHandler.getLanguages() elvégzi a beolvasást, ha a Map értéke null - lásd ott.
     */
    public void dataFromFile() {
        Map<Integer, List<String>> languages = dataHandler.getLanguages();

        System.out.println("A fájl tartalma:");

        for (int key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }

    /**
     * Melyik évhez tartozik a legtöbb programozási nyelv? Keresd meg, és add vissza az évszámot!
     * (Megjegyzés: nincs holtverseny.)
     */
    public int findYearWithMaxLanguages() {

        Map<Integer, List<String>> languages = dataHandler.getLanguages();
        int max = Integer.MIN_VALUE;
        int yr = 0;

        for (int sthing : languages.keySet()) {
            if (languages.get(sthing).size() > max) {
                max = languages.get(sthing).size();
                yr = sthing;
            }
        }
        return yr;
    }

    /**
     * Keresd meg, hogy az adott programozási nyelv melyik évben született, és add vissza az évszámot!
     *
     * A programozási nyelv nevénél teljes egyezés szükséges. Tehát a kis- és nagybetűk eltérő karakternek minősülnek.
     * Például:
     *      findLanguageYear( "java" ) -- nincs találat, mert a fájlban nagy kezdőbetűvel szerepel ("Java")
     *      findLanguageYear( "VVVV" ) -- nincs találat, mert a fájlban kisbetűvel szerepel ("vvvv")
     *      findLanguageYear( "C+" ) -- nincs találat, mert a fájlban két + jel van ("C++")
     *
     * Ha nincs találat, akkor a metódus a -1 értékkel térjen vissza.
     *
     */
    public int findLanguageYear(String languageName) {
        // TODO

        Map<Integer, List<String>> languages = dataHandler.getLanguages();
        int yr = -1;

        for (int sthing : languages.keySet()) {
            if (languages.get(sthing).contains(languageName)) {
                yr = sthing;
            }
        }
        return yr;
    }

    /**
     * Mely programozási nyelvek neve tartalmazza a keresett szót (vagy szótöredéket)?
     * Keresd meg, és add vissza őket!
     *
     * A keresés során nem számít a kis- és nagybetű, ahogyan a teljes egyezés sem.
     * Például:
     *      searchForLanguages( "c+" ) - 3 találat (C++, Managed Extensions for C++, Turbo C++)
     *      searchForLanguages( "VVV" ) - 1 találat (vvvv)
     *      searchForLanguages( "!" ) - 3 találat (Action!, Go!, Snap!)
     *
     * Ha nincs olyan programozási nyelv, akkor a metódus üres (0 hosszúságú) listával térjen vissza.
     */
    public List<String> searchForLanguages(String searchFor) {
        // TODO

        Map<Integer, List<String>> languages = dataHandler.getLanguages();
        List<String> name = new ArrayList<>();

        for (List<String> sthing : languages.values()) {
            for (String someString : sthing) {
                if (someString.toLowerCase(Locale.ROOT).contains(searchFor.toLowerCase(Locale.ROOT))) {
                    name.add(someString);
                }
            }
        }
        return name;
    }

    /**
     * Hány darab olyan programozási nyelv van, amelynek a neve csupán egy karakterből áll?
     * Számold meg őket!
     *
     * @return 13
     */
    public int countLanguagesWithOneLetterName() {
        // TODO

        Map<Integer, List<String>> languages = dataHandler.getLanguages();
        int counter = 0;

        for (List<String> sthing : languages.values()) {
            for (String someString : sthing) {
                if (someString.length() == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * Melyik programozási nyelvnek van a leghosszabb neve? Találd meg!
     * (Megjegyzés: nincs holtverseny.)
     *
     * @return Allgemeiner Berichts Aufbereitungs Prozessor
     */
    public String findLongestNamedLanguage() {
        // TODO
        Map<Integer, List<String>> languages = dataHandler.getLanguages();
        String name = null;
        int max = Integer.MIN_VALUE;

        for (List<String> sthing : languages.values()) {
            for (String someString : sthing) {
                if (someString.length() > max) {
                    max = someString.length();
                    name = someString;
                }
            }
        }
        return name;
    }

}
