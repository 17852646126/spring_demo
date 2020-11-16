package com.major.assembling;

import com.major.dI.SpellChecker;

public class TextEditor {
    private SpellChecker spellChecker1;
    private String name;
    public void setSpellChecker1( SpellChecker spellChecker1 ){
        this.spellChecker1 = spellChecker1;
    }
    public SpellChecker getSpellChecker1() {
        return spellChecker1;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        System.out.println(name);
        spellChecker1.checkSpelling();
    }
}
