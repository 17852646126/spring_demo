package com.major;

public class HelloWorld {
   private String message;
   private String message1;
   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void setMessage1(String message1){
      this.message1  = message1;
   }
   public void getMessage1(){
      System.out.println("Your Message1 : " + message1);
   }

   public void start(){
      System.out.println("生命周期 实例化 bean时");
   }
   public void  end(){
      System.out.println("生命周期 容器中移除 bean 之后");
   }
}