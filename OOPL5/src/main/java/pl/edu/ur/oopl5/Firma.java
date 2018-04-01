package pl.edu.ur.oopl5;
/*@autor Roman
*/
public class Firma {

    Pracownik[] pracowniki = new Pracownik[100];
    public int i=0;

    public void newWorking(Pracownik pracownik){

        if(i<100){
            pracowniki[i]=pracownik;
            i++;
            System.out.println("Pracownik dodany ");
        } else {
            System.out.println("Nie ma miejsca na firmie ");
        }
    }

    public void showWorking(){
        int k=0;
        if(k==0){
            System.out.println("Nie ma pracownikow ");
        } else {
            System.out.println("Na firmie sa "+(i+1)+" pracownikow ");
            for (k =i;k>=0;k--){
                System.out.println(pracowniki[k]);
            }
        }
    }
}