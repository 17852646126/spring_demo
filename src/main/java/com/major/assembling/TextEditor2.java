package com.major.assembling;

import com.major.dI.SpellChecker;

public class TextEditor2 {
    private SpellChecker spellChecker2;
    private String name;
    public TextEditor2( SpellChecker spellChecker2, String name ) {
        this.spellChecker2 = spellChecker2;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker2;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker2.checkSpelling();
    }
}
