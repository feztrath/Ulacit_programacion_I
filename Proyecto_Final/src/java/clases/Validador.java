/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author rchavarr
 */
public class Validador {
    public Validador(){
        //
    }
    public boolean AtributosCorrectos(String pEmail){/*,String pContrasena){*/
        boolean resultado = true;
        /*
        if(pContrasena.isEmpty()|| pContrasena.length() < 4)
        {
            resultado = false;
        }*/
        
        if(!pEmail.contains("@"))
        {
            resultado = false;
        }
        return resultado;
        //
    }
    public boolean EsJoven(String pFecha){
        String[] fecha = pFecha.split("-");
        boolean resultado = false;
        String[] FechaDeHoy = {"2019","11","19"};
        if(fecha.length == 3 ){
            int nacimiento = Integer.parseInt(FechaDeHoy[0]);
            int hoy = Integer.parseInt(fecha[0]);
            if(Math.abs(hoy - nacimiento) < 18 && Math.abs(hoy - nacimiento) > 12){
                resultado = true;
            }
        }
        //
        return resultado;
    }
}