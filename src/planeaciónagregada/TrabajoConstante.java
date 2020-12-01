/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planeaciónagregada;

/**
 *
 * @author josej
 */
public class TrabajoConstante {
    int P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12; //Requerimiento de produccion
    int PD1, PD2, PD3, PD4, PD5, PD6, PD7, PD8, PD9, PD10, PD11, PD12; //Dias habiles por mes
    int PH1, PH2, PH3, PH4, PH5, PH6, PH7, PH8, PH9, PH10, PH11, PH12; //Horas disponibles por dia
    int InventarioInicial, InventarioSeguridad, HoraTrabajo, costoContratacion, CostoDespido, TiempoRegular;

    public TrabajoConstante(int P1, int P2, int P3, int P4, int P5, int P6, int P7, int P8, int P9, int P10, int P11, int P12, int PD1, int PD2, int PD3, int PD4, int PD5, int PD6, int PD7, int PD8, int PD9, int PD10, int PD11, int PD12, int PH1, int PH2, int PH3, int PH4, int PH5, int PH6, int PH7, int PH8, int PH9, int PH10, int PH11, int PH12, int InventarioInicial, int InventarioSeguridad, int HoraTrabajo, int costoContratacion, int CostoDespido, int TiempoRegular) {
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.P4 = P4;
        this.P5 = P5;
        this.P6 = P6;
        this.P7 = P7;
        this.P8 = P8;
        this.P9 = P9;
        this.P10 = P10;
        this.P11 = P11;
        this.P12 = P12;
        this.PD1 = PD1;
        this.PD2 = PD2;
        this.PD3 = PD3;
        this.PD4 = PD4;
        this.PD5 = PD5;
        this.PD6 = PD6;
        this.PD7 = PD7;
        this.PD8 = PD8;
        this.PD9 = PD9;
        this.PD10 = PD10;
        this.PD11 = PD11;
        this.PD12 = PD12;
        this.PH1 = PH1;
        this.PH2 = PH2;
        this.PH3 = PH3;
        this.PH4 = PH4;
        this.PH5 = PH5;
        this.PH6 = PH6;
        this.PH7 = PH7;
        this.PH8 = PH8;
        this.PH9 = PH9;
        this.PH10 = PH10;
        this.PH11 = PH11;
        this.PH12 = PH12;
        this.InventarioInicial = InventarioInicial;
        this.InventarioSeguridad = InventarioSeguridad;
        this.HoraTrabajo = HoraTrabajo;
        this.costoContratacion = costoContratacion;
        this.CostoDespido = CostoDespido;
        this.TiempoRegular = TiempoRegular;
        //Datos de prueba ejemplo clase
        /*this.HoraTrabajo = 5;
        this.costoContratacion = 200;
        this.CostoDespido = 250;
        this.TiempoRegular = 4;*/
    }
    
    public int OperaTC(){
        return 0;
    }
}
