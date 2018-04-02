package pl.edu.ur.oopl5;
/*@autor Roman
*/
public class Firma {

    Pracownik[] pracowniki = new Pracownik[100];
    int i=0;
    int size = 100;
    int top=-1;

    public Firma( ) { }

    public void newWorking(Pracownik pracownik){
        int i = ++top;
        if(i<100){
            pracowniki[i]=pracownik;
            System.out.println("Pracownik dodany ");
        } else {
            System.out.println("Nie ma miejsca na firmie ");
        }
    }

    public void showWorking(){
        int k=top;
        if(k==-1){
            System.out.println("Nie ma pracownikow ");
        } else {
            System.out.println("Na firmie sa "+(top+1)+" pracownikow ");
            for (k =top;k>=0;k--){
                System.out.println(pracowniki[k]);
            }
        }
    }
}