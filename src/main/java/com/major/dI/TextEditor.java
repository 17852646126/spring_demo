package com.major.dI;

public class TextEditor {
    private SpellChecker spellChecker;
    private String str1;
    private String str2;
    public TextEditor(SpellChecker spellChecker,String str1){
        System.out.println("TextEditor的构造函数输出");
        this.spellChecker=spellChecker;
        this.str1=str1;
    }
    public void setStr2(String str2){
        this.str2=str2;
    }
    public String getStr2(){
        return str2;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();//调用SpellChecker的checkSpelling方法
        System.out.println("str1的值为："+str1);
        System.out.println("str2的值为："+str2);
    }
}
