package com.mycompany.niquel;

public class Sorter {
   
    private final String[] emojis;
    public String a,b,c;
    public int tries = 0, winState = 4;
    
    public Sorter(){
        this.emojis = new String[]{"💩", "🍒", "💲", "💎"};
        
       
    }
    
    public void roll(){
        tries++;
        if(tries >= 5){
            tries = 5;
        }
        for(int i = 1; i <= 3; i++){
            switch(i){
                // Atribute value to A
                case 1:
                    this.a = chance();
                break;
                
                // Atribute value to B
                case 2:
                    this.b = chance();
                break;
                
                // Atribute value to C
                case 3:
                    this.c = chance();                  
                break;
            }     
        }
        if(a.equals(b) && b.equals(c) && c.equals(a)){
            switch(a){
                case "💩":
                    winState = 0;
                break;
                case "🍒":
                    winState = 1;
                    tries = 0;
                break;
                case "💲":
                    winState = 2;
                    tries = 0;
                break;
                case "💎":
                    winState = 3;
                    tries = 0;
                break;
            }
        }else{
            winState = 4;
        }
    }    
    
    private String chance(){
        String n = "";
        int value = random(0, 100);
        // 100 for diamond; 99 -> 89 for money; 
        if(value == 100){
            n = emojis[3];
        }
        else if(value < 100 && value >= 88){
            n = emojis[2];
        }
        else{
            switch(tries){
                // 10%
                case 1:
                    // 88 -> 78 for cherry
                    if(value >= 0 && value <= 78 ){
                        n = emojis[0];
                    }
                    else if(value > 78 && value < 88){
                        n = emojis[1];
                    }
                break;

                // 20%
                case 2:
                    // 88 -> 68 for cherry
                    if(value >= 0 && value <= 68 ){
                        n = emojis[0];
                    }
                    else if(value > 68 && value < 88){
                        n = emojis[1];
                    }
                break;

                // 30%
                case 3:
                    // 88 -> 58 for cherry
                    if(value >= 0 && value <= 58 ){
                        n = emojis[0];
                    }
                    else if(value > 58 && value < 88){
                        n = emojis[1];
                    }
                break;

                // 40%
                case 4:
                    // 88 -> 48 for cherry
                    if(value >= 0 && value <= 48 ){
                        n = emojis[0];
                    }
                    else if(value > 48 && value < 88){
                        n = emojis[1];
                    }
                break;

                // 50% and final
                case 5:
                    // 88 -> 38 for cherry
                    if(value >= 0 && value <= 38 ){
                        n = emojis[0];
                    }
                    else if(value > 38 && value < 88){
                        n = emojis[1];
                    }
                break;
            }  
        }
        return n;
    }
    
   
    
    private int random(int min, int max){
        int result = (int)Math.floor(Math.random()*(max-min+1)+min);
        return result;
    }
}
