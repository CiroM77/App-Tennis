/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tenisset;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ciro-
 */
public class TenisSet {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] puntos ={"0", "15", "30","40", "AD"};
        int proba1=0;
        int setPartido=0;
        boolean sacaJugador1=true;
        boolean tiebreak=false;
        ArrayList<Integer> setJuegosJugador1 = new ArrayList<Integer>();
        ArrayList<Integer> setJuegosJugador2 = new ArrayList<Integer>();
       

        // Solicitar nombres de los jugadores y torneo
         System.out.println("Ingrese el nombre del Torneo:");
        String nombreTorneo = sc.nextLine();
        System.out.println("Ingrese el nombre del jugador 1:");
        String nombreJugador1 = sc.nextLine();
        System.out.println("Ingrese el nombre del jugador 2:");
        String nombreJugador2 = sc.nextLine();
        
        // Insertar cantidad de set
        while(setPartido != 3 && setPartido!=5){
         System.out.println("Ingrese si la cantidada de set son a 3 o 5");
         setPartido = sc.nextInt();
         if(setPartido != 3 && setPartido!=5){
             System.out.println("Inserte un número válido de set:");
             setPartido = sc.nextInt();
         }
         else {}
        }
        
        //Insertar probabilidades
        while(proba1 > 100 || proba1 < 1){
        System.out.println("Ingrese probabilidad de 0 a 100 de ganar de " + nombreJugador1);
        System.out.println("¡Recuerde que el porcentaje restante serán las probabilidades de " + nombreJugador2 + "!");
        proba1 = sc.nextInt();
        if (proba1 > 100) {
                System.out.println("El número ingresado es mayor que 100. Inténtalo de nuevo."+"\n");
            } else if (proba1 < 1) {
                System.out.println("El número ingresado es menor que 1. Inténtalo de nuevo."+"\n");
            } else {             
            }}

        
        // Inicializar variables
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        int juegosJugador1 = 0;
        int juegosJugador2 = 0;
        int setJugador1 = 0;
        int setJugador2 = 0;
        int revancha = 1;
       
       // Saque inicial
       System.out.println("Saca "+nombreJugador1);
       
       
        // Partido
         do {
          Random random = new Random();
          int r = random.nextInt(100) + 1;
            if (r < proba1) {
                puntosJugador1++;
                System.out.println("Punto de "+ nombreJugador1);
                if (puntosJugador1 != 4 && puntosJugador2 <= 2 && tiebreak ==false ){
                System.out.println(nombreJugador1 +": "+ juegosJugador1 + " "+ puntos[puntosJugador1]);
                System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "+ puntos[puntosJugador2]+"\n");
                }
            } else {            
                puntosJugador2++;
                System.out.println("Punto de "+ nombreJugador2);
                if(puntosJugador2 != 4 && puntosJugador1 <= 2 && tiebreak ==false){
                System.out.println(nombreJugador1 +": "+ juegosJugador1 + " "+ puntos[puntosJugador1]);
                System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "+ puntos[puntosJugador2]+"\n");
                }
            }
            
            // Verificar si hay un ganador de juego
            //Primero en tiebreak
            if (juegosJugador1 == 6 && juegosJugador2 == 6){               
                System.out.println("Tiebreak");
                tiebreak=true;
                System.out.println(nombreJugador1 +": "+ juegosJugador1 + " "+ puntosJugador1);
                System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "+ puntosJugador2+"\n");
                if(puntosJugador1 >= 7 && puntosJugador1 - puntosJugador2 == 2){
                    puntosJugador1 = 0;
                    puntosJugador2 = 0;
                    juegosJugador1++;
                    System.out.println("¡" + nombreJugador1 + " gana el set! "+ juegosJugador1 +" - "+juegosJugador2 );
                    setJugador1++;
                    setJuegosJugador1.add(juegosJugador1);
                    setJuegosJugador2.add(juegosJugador2);
                    juegosJugador1 = 0;
                    juegosJugador2 = 0;
                    tiebreak=false;
                   
                }
                else if(puntosJugador2 >= 7 && puntosJugador2 - puntosJugador1 == 2){
                    puntosJugador1 = 0;
                    puntosJugador2 = 0;
                    juegosJugador2++;
                    System.out.println("¡" + nombreJugador2 + " gana el set! "+ juegosJugador1 +" - "+juegosJugador2 );
                    setJugador2++;
                    setJuegosJugador1.add(juegosJugador1);
                    setJuegosJugador2.add(juegosJugador2);
                    juegosJugador1 = 0;
                    juegosJugador2 = 0;
                    tiebreak=false;
                }
            }
            // Game normal
            else {
                if (puntosJugador1 >= 4 && puntosJugador1 - puntosJugador2 >= 2) {
                System.out.println("¡" + nombreJugador1 + " gana el juego!"+"\n");
                puntosJugador1 = 0;
                puntosJugador2 = 0;
                juegosJugador1++;
                if (sacaJugador1 == true){
                  sacaJugador1 = false; 
                  System.out.println("Saca "+nombreJugador2);
                }
                else if (sacaJugador1 == false){
                    sacaJugador1 = true;
                   System.out.println("Saca "+nombreJugador1);
                }
                
            } else if (puntosJugador2 >= 4 && puntosJugador2 - puntosJugador1 >= 2) {
                System.out.println("¡" + nombreJugador2 + " gana el juego!"+"\n");
                puntosJugador1 = 0;
                puntosJugador2 = 0;
                juegosJugador2++;
                 if (sacaJugador1 == true){
                  sacaJugador1 = false;
                  System.out.println("Saca "+nombreJugador2);
                }
                else if (sacaJugador1 == false){
                    sacaJugador1 = true;
                    System.out.println("Saca "+nombreJugador1);
                }
            }
            }         
          
            // Verificar el Deuce
            if (puntosJugador1 >=3 && puntosJugador2 >=3 && puntosJugador1 == puntosJugador2 && tiebreak ==false){
                System.out.println("Deuce");
                System.out.println(nombreJugador1 +": "+ juegosJugador1 + " " +"40 ");     
                System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "  +"40 "+"\n");
            } 
            // Verificar la Ventaja
            if (puntosJugador1 >= 4 && puntosJugador2 == puntosJugador1 -1 && tiebreak ==false){   
                System.out.println(nombreJugador1 +": "+ juegosJugador1 + " " +"AD ");     
                System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "  +"40 "+"\n"); 
                } 
            if (puntosJugador2 >= 4 && puntosJugador1 == puntosJugador2 -1 && tiebreak ==false){   
               System.out.println(nombreJugador1 +": "+ juegosJugador1 + " " +"40 ");     
               System.out.println(nombreJugador2 +": "+ juegosJugador2 + " "  +"AD "+"\n");             
                } 
            // Ganar game
            if(puntosJugador1 >= 5 && puntosJugador1 - puntosJugador2 ==2 && tiebreak ==false){
                System.out.println("¡" + nombreJugador1 + " gana el juego!");
                puntosJugador1 = 0;
                puntosJugador2 = 0;
                juegosJugador1++;
            }
             if(puntosJugador2 >= 5 && puntosJugador2 - puntosJugador1 ==2 && tiebreak ==false){
                System.out.println("¡" + nombreJugador2 + " gana el juego!");
                puntosJugador1 = 0;
                puntosJugador2 = 0;
                juegosJugador2++;
            }                       

            // Verificar si hay un ganador de set
            if (juegosJugador1 >= 6 && juegosJugador1 - juegosJugador2 >= 2 ) {
                System.out.println("¡" + nombreJugador1 + " gana el set! "+ juegosJugador1 +" - "+juegosJugador2 );
                setJugador1++;
                setJuegosJugador1.add(juegosJugador1);
                setJuegosJugador2.add(juegosJugador2);
                juegosJugador1 = 0;
                juegosJugador2 = 0;
            } else if (juegosJugador2 >= 6 && juegosJugador2 - juegosJugador1 >= 2) {
                System.out.println("¡" + nombreJugador2 + " gana el set! "+ juegosJugador1 +" - "+juegosJugador2);
                setJugador2++;
                setJuegosJugador1.add(juegosJugador1);
                setJuegosJugador2.add(juegosJugador2);
                juegosJugador1 = 0;
                juegosJugador2 = 0;
            }
            

            // Verificar si hay un ganador de partido
            if (setJugador1 >= setPartido - 1 && setPartido ==3 || setJugador1 >= setPartido - 2 && setPartido ==5 ) {
                System.out.println("¡" + nombreJugador1 + "    gana el partido en el " +nombreTorneo+ "!");
                System.out.print(nombreJugador1 + ": ");
                for (int i = 0; i < setJuegosJugador1.size(); i++) {
                    System.out.print(setJuegosJugador1.get(i) + " ");
                }
                System.out.print("\n");
                System.out.print(nombreJugador2 + ": ");
                for (int i = 0; i < setJuegosJugador2.size(); i++) {
                    System.out.print(setJuegosJugador2.get(i) + " ");
                }
              
                
            } else if (setJugador2 >= setPartido - 1 || setJugador2 >= setPartido - 2 && setPartido ==5) {
                System.out.println("¡" + nombreJugador2 + "    gana el partido en el " +nombreTorneo + "!");
                System.out.print(nombreJugador1 + ": ");
                for (int i = 0; i < setJuegosJugador1.size(); i++) {
                    System.out.print(setJuegosJugador1.get(i) + " ");
                }
                System.out.print("\n");
                System.out.print(nombreJugador2 + ": ");
                for (int i = 0; i < setJuegosJugador2.size(); i++) {
                    System.out.print(setJuegosJugador2.get(i) + " ");
                }
              
            }  
            
            if(setJugador1 >= setPartido - 1 && setPartido ==3 || setJugador1 >= setPartido - 2 && setPartido ==5){
                System.out.println("  ");
                System.out.print("¿Desea jugar la revancha? Si=1 o No=2: ");
                 puntosJugador1 = 0;
                 puntosJugador2 = 0;
                 juegosJugador1 = 0;
                 juegosJugador2 = 0;
                 setJugador1 = 0;
                 setJugador2 = 0;
                 setJuegosJugador1.clear();
                 setJuegosJugador2.clear();
                revancha = sc.nextInt();
            }
            else if (setJugador2 >= setPartido - 1 || setJugador2 >= setPartido - 2 && setPartido ==5){
              System.out.println("  ");
              System.out.print("¿Desea jugar la revancha? Si=1 o No=2: ");
               puntosJugador1 = 0;
                 puntosJugador2 = 0;
                 juegosJugador1 = 0;
                 juegosJugador2 = 0;
                 setJugador1 = 0;
                 setJugador2 = 0;
                 setJuegosJugador1.clear();
                 setJuegosJugador2.clear();
              revancha = sc.nextInt();
            }
            
           
            
    } while(revancha == 1);
                 System.out.println("  ");
                 System.out.println("Gracias por haber jugado en el " + nombreTorneo);
    }
        
}

