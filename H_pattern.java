class UniqueCharacters {
    public static boolean checkUniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Welcome";
        if (checkUniqueCharacters(str)) {
            System.out.println("the given string contain unique characters");
        } else {
            System.out.println("the given string does not contain unique characters");
             
        }
    }
}
