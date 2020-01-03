package com.languagefamilies;

//Program for tracking traits across language families.
class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //Constructor method
    protected Language(String myName, int mySpeakers, String regions,String wordsOrder){
        name = myName;
        numSpeakers = mySpeakers;
        regionsSpoken = regions;
        wordOrder = wordsOrder;
    }

    //Method to show information regarding the language
    public void getInfo(){
        System.out.println(name + " is spoken by "+ numSpeakers + " people mainly in " +regionsSpoken+ ".");
        System.out.println("The language follows the word order: "+wordOrder);
    }

    public static void main(String[] args){
        Language spanish = new Language("spanish", 5500000,"Spain,Latin America", "subject-verb-object");

        Mayan kiche = new Mayan("K'iche'", 2330000);

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese",2000000000);
        SinoTibetan Burmese = new SinoTibetan("Burmese", 2000000);

        mandarin.getInfo();
        Burmese.getInfo();

    }
}