package ch.bbw;

public  class Wanze  {
    public void Kinderlied(String word, String verb){
        String end = "()";
        do {
            System.out.println("Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + word);
            System.out.println("Sieh einmal die " + word + " an, wie die " + word + " " + verb + " kann");
            System.out.println("Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + word);
            System.out.println("* * *");
            word = word.substring(0, word.length() - 1);
            if (verb.endsWith("en")) {
                verb = verb.substring(0, verb.length() - 1);
            }
            verb = verb.substring(0, verb.length() - 1);
            if (word.length() == 0) {
                word = "()";
                verb = "()";
            }
        }
        while(word != end);
        System.out.println("Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + end);
        System.out.println("Sieh einmal die " + end + " an, wie die " + end + " " + end + " kann");
        System.out.println("Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + end);



    }
}


