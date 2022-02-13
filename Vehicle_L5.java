/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vit;

import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
class Vehicle{
    String vehname,vehno;
    Vehicle(String vehname,String vehno){
        this.vehname = vehname;
        this.vehno = vehno;
    }
    void show(){
        System.out.println("Vehicle name is:"+vehname+"\nVehicle number is: "+vehno);
    }
}
class Truck extends Vehicle{
    public Truck(String vehname, String vehno) {
        super(vehname, vehno);
    }
    void show(){
        super.show();
    }
}
class Car extends Vehicle{
    int mileage;
    public Car(String vehname, String vehno,int mileage) {
        super(vehname, vehno);
        this.mileage = mileage;
    }
    void find(){
        if(mileage>23){
            super.show();
            System.out.println(mileage);
        }
    }
}
public class Vehicle_L5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Truck[] tr = new Truck[2];
        Car[] car = new Car[3];
        car[0]=new Car("Honda","MH01AF9283",24);
        car[1]=new Car("Merc","MH01CF9113",22);
        car[2]=new Car("Renault","MH91AA1183",25);
        int i;
        for(i=0;i<3;i++){
            car[i].find();
        }
    }
}
