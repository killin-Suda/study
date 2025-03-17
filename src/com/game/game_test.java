package com.game;

public class game_test {
    public static void main(String[]args){
        Role r1=new Role("1",100);
        Role r2=new Role("2",100);
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"打败了"+r2.getName());
                break;
            }
        }
    }
}
