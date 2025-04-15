package controllers;

import models.Persona;
import views.ShowConsole;
public class MetodosBusqueda{
    private Persona[] people;

    private ShowConsole showConsole;

    public MetodosBusqueda(){

    }

    public MetodosBusqueda(Persona[] person){
        showConsole = new showconsole(); 
        this.people=person;
        showPersonByCode();
    }
     

    public int busquedaLineal(int[] arreglo, int valorBuscar ){
        for (int i=0;i< arreglo.length;i++){
            if (arreglo[i]==valorBuscar){
                return i;
            }
        }
        return -1;
    }
    public int findPersonByCode(int code){
        for (int i =0;i<people.length;i++) {
            if(people[i].getCode()==code){
                return i;
    
            }
            
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFinde = ShowConsole.getcode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson>=0){
            showconsole.showMessage("Persona no encontrada");
            showconsole.showMessage(people[indexPerson].toString());
        }else{
            showconsole.showMessage("Persona con codigo"+codeToFinde);
        }
    }
    
}