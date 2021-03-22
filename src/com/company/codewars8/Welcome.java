package com.company.codewars8;


import java.util.HashMap;
import java.util.Optional;

//Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.
//
//        The Task
//        Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
//        Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
//        The Database
//        english: "Welcome",
//        czech: "Vitejte",
//        danish: "Velkomst",
//        dutch: "Welkom",
//        estonian: "Tere tulemast",
//        finnish: "Tervetuloa",
//        flemish: "Welgekomen",
//        french: "Bienvenue",
//        german: "Willkommen",
//        irish: "Failte",
//        italian: "Benvenuto",
//        latvian: "Gaidits",
//        lithuanian: "Laukiamas",
//        polish: "Witamy",
//        spanish: "Bienvenido",
//        swedish: "Valkommen",
//        welsh: "Croeso"
public class Welcome {

    public static String greet(String language){
        HashMap<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        greeting.put("estonian", "Tere tulemast");
        greeting.put("finnish", "Tervetuloa");
        greeting.put("flemish", "Welgekomen");
        greeting.put("french", "Bienvenue");
        greeting.put("german", "Willkommen");
        greeting.put("irish", "Failte");
        greeting.put("italian", "Benvenuto");
        greeting.put("latvian", "Gaidits");
        greeting.put("lithuanian", "Laukiamas");
        greeting.put("polish", "Witamy");
        greeting.put("spanish", "Bienvenido");
        greeting.put("swedish", "Valkommen");
        greeting.put("welsh", "Croeso");

        if (greeting.containsKey(language)) {
            return greeting.get(language);
        }
        return greeting.get("english");
    }
}

    public static String greet(String language){
        HashMap<String, String> map = new HashMap<>();

        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");

        return map.getOrDefault(language, map.get("english"));
    }


    import java.util.HashMap;
            import java.util.Optional;

public class Welcome {
    public static String greet(String language){
        HashMap<String, String> languages = new HashMap<String, String>();

        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");

        return Optional.ofNullable(languages.get(language)).orElse("Welcome");
    }
}
