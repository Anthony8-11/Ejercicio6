package PKG;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class ArrayListSample {

    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();

        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("ir a votar");


        String primerElemento = taskList.get(0);
        System.out.println("Primer elemento: "+primerElemento);

        int pos =0;
        for (String item : taskList){
            System.out.println(pos+" Tarea: "+item);
            pos ++;
        }

/*        System.out.println("Elimina pos 0: ");
        taskList.remove(0);
        primerElemento = taskList.get(0);
        System.out.println("Primer elemento"+primerElemento);*/

    }

    public void ejercicio2(){

        List<Integer> taskList = new ArrayList<>();

        taskList.add(100);
        taskList.add(200);
        taskList.add(300);
        taskList.add(400);

        int suma=0;
        for (Integer item : taskList){
            suma=suma+item;

        }

        System.out.println(taskList);
        System.out.println(suma);



    }

    public void listaTareas(){

        List<taskList> al = new ArrayList<>();

        taskList tarea = new taskList();

        tarea = new taskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Mesa 2");
        tarea.setDone(false);
        al.add(tarea);

        tarea = new taskList();

        tarea.setTaskName("Sacar al chucho");
        tarea.setTaskDescription("Sacar a firulais al parque");
        tarea.setDone(false);
        al.add(tarea);

        tarea = new taskList();

        tarea.setTaskName("Hacer la casa");
        tarea.setTaskDescription("si mama o mujer me regaña");
        tarea.setDone(false);
        al.add(tarea);



        int pos =0;
        for (taskList item : al){
            System.out.println(pos+toString());
            pos ++;
        }

;

    }


}
