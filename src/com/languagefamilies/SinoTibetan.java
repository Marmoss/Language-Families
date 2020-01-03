package com.languagefamilies;

class SinoTibetan extends Language{

    //Constructor that also checks for exceptions in language Ex: chinese
    SinoTibetan(String languageName,int speakers){
        super(languageName, speakers,"Asia","subject-object-verb");
        if (languageName.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }

}