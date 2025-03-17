package com.game;

import java.util.Random;

public class Role {
    private String role;
    private int blood;
    public Role(){
    }
    public Role(String role,int blood){
        this.role=role;
        this.blood=blood;
    }
    public void setName(String role){
        this.role=role;
    }
    public String getName(){
        return role;
    }
    public void setBlood(int blood){
        this.blood=blood;
    }
    public int getBlood(){
        return blood;
    }
    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        int remainBlood=role.getBlood()-hurt;
        remainBlood=remainBlood<0?0:remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+"打了"+role.getName()+"一下，给"+role.getName()+"造成了"+hurt+"点伤害");
    }
}
