/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * preso da Jakub
 */
public class MainServer {
    public static void main(String[] args) {
        Server s1 = new Server(1024);
        s1.attendi();
        s1.leggi();
        s1.scrivi();
        s1.chiudi();
        s1.termina();

    }

}