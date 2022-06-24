package com.heshanthenura.dopplereffect;

public class DopplerEffect {

    public static void main(String[] args) {
        System.out.println(MediumVelocity(20,10,100,110));
    }

    public static double MediumVelocity(double Vo, double Vs, double Fs, double Af){
        return (((Fs*Vo)+(Af*Vs))/(Af-Fs));
    }

    public static double ObserverVelocity(double Vm, double Vs, double Fs, double Af){
        return (((Af*Vm)-(Af*Vs)-(Vm*Fs))/(Fs));
    }

    public static double SourceVelocity(double Vm, double Vo, double Fs, double Af){
        return (((Af*Vm)-(Vm*Fs)-(Vo*Fs))/(Af));
    }

    public static double SourceFrequency(double Vm, double Vo, double Vs, double Af){
        return (((Af*Vm)-(Af*Vs))/(Vm+Vo));
    }

    public static double ApparentFrequency(double Vm, double Vo, double Vs, double Fs){
        return ((Vm+Vo)/(Vm-Vs))*(Fs);
    }


}
