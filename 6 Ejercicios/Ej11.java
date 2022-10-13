public class Ej11 {
    public static void main(String args[]){
/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */

        double x= 0;
        int sus = 0;
        int suf = 0;
        int bie = 0;
        int not = 0;
        int sob = 0;
        String nota = "";
        for(int i = 0; i <20; i++){
            x = Math.random()*10;
            
            if(x < 5){
                nota = "suspenso";
                sus++;
            }
            if(x >= 5 && x < 6){
                nota = "suficiente";
                suf++;
            }
            if (x >= 6 && x < 7){
                nota = "bien";
                bie++;
            }
            if(x >=7 && x < 9){
                nota = "notable";
                not++;
            }
            if(x >= 9 && x <= 10){
                nota = "sobresaliente";
                sob++;
            }
            System.out.println(nota);

        }
        System.out.println();
        System.out.println("Han sido " + sus + " suspensos " + suf + " suficientes " + bie + " bien " + not + " notables y " + sob + " sobresalientes.");


    }
    
}
