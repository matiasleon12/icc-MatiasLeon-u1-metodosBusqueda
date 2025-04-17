package controllers;

import models.Persona;
import views.ShowConsole;
public class MetodosBusquedaBinaria {

    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria (Persona[] personas){
        this.people=personas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodos de busqueda binaria ");
    }

    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo<= alto){
            int central = bajo + (alto-bajo)/2;

            if(people[central].getCode()==code){
            return central;
            }
        

            if (people[central].getCode()<code){
                bajo= central+1;
            }else{
                alto=central-1;
            }
        }
        return-1;
        
    }
    public void showPersonByCode(){
        int codeToFinde=pantalla.getCode();
        int indexPerson=findPersonByCode(codeToFinde);
        if (indexPerson==-1){
            pantalla.showMessage("No hay la persona con ese codigo ");

        }else{
            pantalla.showMessage("Persona con codigo: "+ codeToFinde+" encontrada ");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }
    
}
