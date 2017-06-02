
/**
 * Write a description of class TP1 here.
 *
 * @author (Alexandre Clément)
 * @code permanant (CLEA16059309_)
 * @version (a version number or a date)
 */

public class KiosqueLimonade{
          public static final String MSG_MENU_STARS = "****************************";
          public static final String MSG_MENU = "MENU";
          public static final String MSG_MENU_OPT1 = "1. Prendre une commande";
          public static final String MSG_MENU_OPT2 = "2. Consulter les ventes";
          public static final String MSG_MENU_OPT3 = "3. Quitter";
          public static final String MSG_CHOIX = "\nEntrez votre choix au menu :";
          public static final String MSG_ERREUR = "Erreur, choix de menu invalide... Recommencez !";
          public static final String MSG_MENU1_D = "--------";
          public static final String MSG_COMMANDE = "COMMANDE";
          public static final String MSG_FORMAT = "Format => (G)rand, (M)oyen, (P)etit :";
          public static final String MSG_NB_VERRE = "Nombre de verres de format ";
          public static final String MSG_ADD_ITEM = "Ajouter un autre item ? => (O)ui ou (N)on :";
          public static final String MSG_TOTAL = "MONTANT TOTAL DE LA COMMANDE :";
          public static final double SMALL = 50;
          public static final double MEDIUM = 75;
          public static final double LARGE = 100;
          public static final String MSG_ERR_NBVERRE = "Erreur, entrez une valeur positive... Recommencez !";
          public static final String MSG_ERR_FORMAT = "Erreur, format invalide... Recommencez !";
          public static final String MSG_ERR_AJOUT = "Erreur, vous devez entrer O ou N... Recommencez !";
          public static final String MSG_FIN = "AUREVOIR !";
          public static final String MSG_VENTES = "TOTAL DES VENTES";
          public static final String MSG_RT_MENU = "Appuyez sur <ENTREE> pour revenir au menu...";
          public static final String LIGNE_2 = "-----------------------------------";
          public static final String ENTETE_2 ="----------------";
          public static final String PETIT = "Petit";
          public static final String MOYEN = "Moyen";
          public static final String GRAND = "Grand";
          public static final String FORMAT = " Format";
          public static final String QTE = " Quantité";
          public static final String TOTAL = "Total ($)";
          public static final String FOOTER = "===================================";
          
          
     public static void main(String[] params) {

        char user;
        char addItem;
        char format;
        double nbLarge = 0;
        double nbMedium = 0;
        double nbSmall = 0;
        double totalBill;
        double totalBillD;
        
         do{  
             
             System.out.println(MSG_MENU_STARS);
             System.out.printf("%16S\n",MSG_MENU);
             System.out.println(MSG_MENU_STARS);
             System.out.println(MSG_MENU_OPT1);
             System.out.println(MSG_MENU_OPT2);
             System.out.println(MSG_MENU_OPT3);
             System.out.println(MSG_CHOIX);
        
             user = Clavier.lireCharLn();
             if(user > '3'|| user < '1'){
                 System.out.println(MSG_ERREUR);
                }   

              if(user == '1'){ 
                 double nbVerreS = 0;
                 double nbVerreM = 0;
                 double nbVerreL = 0;
                System.out.println(MSG_MENU1_D);
                System.out.println(MSG_COMMANDE);
                System.out.println(MSG_MENU1_D);
                        do{
                           
                            System.out.print(MSG_FORMAT);
            
                            format = Clavier.lireCharLn();
                            format = Character.toUpperCase(format);
                                while (format != 'P' && format != 'M' && format != 'G') {
                                System.out.println(MSG_ERR_FORMAT);
                                format = Clavier.lireCharLn();
                                format = Character.toUpperCase(format);
                            }
                
                            if(format == 'P'){
                                System.out.printf(MSG_NB_VERRE+ PETIT +": ");
                                nbVerreS = Clavier.lireDoubleLn();
                                while (nbVerreS < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbVerreS = Clavier.lireDoubleLn();
                                } 
                                nbSmall += nbVerreS;
                                
                            }
                  
                            else if (format =='M'){
                                
                                System.out.printf(MSG_NB_VERRE+MOYEN+": ");
                                nbVerreM = Clavier.lireDoubleLn();
                                
                                while (nbVerreM < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbVerreM = Clavier.lireDoubleLn();
                                }
                                nbMedium += nbVerreM;

                            }
               
                            else if (format =='G') {
                               
                                System.out.printf(MSG_NB_VERRE+GRAND+": ");
                                nbVerreL = Clavier.lireDoubleLn();
                                while (nbVerreL < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbVerreL = Clavier.lireDoubleLn();
                                }  
                                nbLarge += nbVerreL;
                            } 

                            System.out.print(MSG_ADD_ITEM);
                                addItem = Clavier.lireCharLn();
                                addItem = Character.toUpperCase(addItem);
                                
                               while(addItem != 'O' && addItem != 'N'){
                                System.out.println(MSG_ERR_AJOUT);
                                addItem = Clavier.lireCharLn();
                                addItem = Character.toUpperCase(addItem);
                               }

                        }while( addItem != 'N');
                        
                        totalBill = nbVerreL * LARGE + nbVerreM * MEDIUM + nbVerreS * SMALL;
                     
                        
                        if(totalBill >= 100){
                            totalBillD = totalBill / 100;
                            System.out.printf("%.2f $\n",totalBillD);
                        }
                        else{
                             System.out.printf("%.0f Cents\n",totalBill);
                        }
                        
                        
                           
                    } 
                    else if (user == '2'){
                        double totalSellSmall;
                        double totalSellMedium;
                        double totalSellLarge;
                        double totalQt;
                        double totalSell;
                        
                        totalSellSmall = (nbSmall * SMALL)/100;
                        totalSellMedium = (nbMedium * MEDIUM)/100;
                        totalSellLarge = (nbLarge * LARGE)/100;
                        totalQt = nbSmall + nbMedium + nbLarge;
                        totalSell = totalSellSmall + totalSellMedium + totalSellLarge;

                        System.out.println(ENTETE_2);
                        System.out.println(MSG_VENTES);
                        System.out.println(ENTETE_2);
                        System.out.println();
                        System.out.printf("%-10S|%-10S|%13S\n",FORMAT,QTE,TOTAL);
                        System.out.println(LIGNE_2);
                        System.out.printf("%-10S| %-10.0f|%10.2f\n",PETIT,nbSmall,totalSellSmall);
                        System.out.printf("%-10S| %-10.0f|%10.2f\n",MOYEN,nbMedium,totalSellMedium);
                        System.out.printf("%-10S| %-10.0f|%10.2f\n",GRAND,nbLarge,totalSellLarge);
                        System.out.println(FOOTER);
                        System.out.printf("%-10S| %-10.0f|%10.2f\n"," ",totalQt,totalSell);
                        
                        
                        System.out.println("\n\n"+ MSG_RT_MENU);
                       
                        Clavier.lireFinLigne();
                        
                   
                   }
                   
          }while(user != '3');

          System.out.println(MSG_FIN);
    }
}