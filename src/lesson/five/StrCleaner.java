package lesson.five;

public class StrCleaner {

    private String newStr;

    public StrCleaner(String text) {
        newStr = text;
    }

    public void strCleaner() {
        newStr = newStr.replace("Navalny", "[censored]");
        newStr = newStr.replace("navalny", "[censored]");
        System.out.println(newStr);
    }

    public String getNewStr() {
        return newStr;
    }
}
