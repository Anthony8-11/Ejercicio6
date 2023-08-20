package PKG;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String nombre;
    private double sueldo_base;
    private double descuentos;
    private double sueldo_liquido;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(double sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }

    public void ejercicio(){

        Empleado ej = new Empleado();
        List<Empleado> lista = new ArrayList<>();

        ej = new Empleado();
        ej.setNombre("Juan");
        ej.setDescuentos(500);
        ej.setSueldo_base(3500);
        lista.add(ej);

        ej = new Empleado();
        ej.setNombre("Pedro");
        ej.setDescuentos(500);
        ej.setSueldo_base(3500);
        lista.add(ej);

        for (Empleado item : lista){
            System.out.println("\nNombre: "+item.getNombre()+
                    "\nSueldo base: "+item.getSueldo_base()+
                    "\nDescuentos: "+item.getDescuentos()+
                    "\nSueldo liquido: "+(item.getSueldo_base()-item.getDescuentos()));
        }


    }


}
