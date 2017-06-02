
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
          public static final double petit = 50;
          public static final double moyen = 75;
          public static final double grand = 100;
          public static final String MSG_ERR_NBVERRE = "Erreur, entrez une valeur positive... Recommencez !";
          public static final String MSG_ERR_FORMAT = "Erreur, format invalide... Recommencez !";
          public static final String MSG_ERR_AJOUT = "Erreur, vous devez entrer O ou N... Recommencez !";
          public static final String MSG_FIN = "AUREVOIR !";   
     public static void main(String[] params) {

        char reponse;
        char additem;
        char format;
        double nbverreg;
        double nbverrem;
        double nbverrep;
        double totalcentp;
        double totalcentm;
        double totalcentg;
        double totalcent ;
        double totaldollars;
        double nbverregt;
        double nbverremt;
        double nbverrept;
         do{  
             
             System.out.println(MSG_MENU_STARS);
             System.out.printf("%16S\n",MSG_MENU);
             System.out.println(MSG_MENU_STARS);
             System.out.println(MSG_MENU_OPT1);
             System.out.println(MSG_MENU_OPT2);
             System.out.println(MSG_MENU_OPT3);
             System.out.println(MSG_CHOIX);
        
             reponse = Clavier.lireCharLn();
             if(reponse > '3'|| reponse < '1'){
                 System.out.println(MSG_ERREUR);
                }   

              if(reponse == '1'){ 
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
                                System.out.printf(MSG_NB_VERRE+"PETIT: ");
                                nbverrep = Clavier.lireDoubleLn();
                                while (nbverrep < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbverrep = Clavier.lireDoubleLn();
                                } 
                            }
                  
                            else if (format =='M'){
                                
                                System.out.printf(MSG_NB_VERRE+"MOYEN: ");
                                nbverrem = Clavier.lireDoubleLn();
                                
                                while (nbverrem < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbverrem = Clavier.lireDoubleLn();
     
                                }  
                            }
               
                            else if (format =='G') {
                               
                                System.out.printf(MSG_NB_VERRE+"GRAND: ");
                                nbverreg = Clavier.lireDoubleLn();
                                while (nbverreg < 0){
                                    System.out.println(MSG_ERR_NBVERRE);
                                    nbverreg = Clavier.lireDoubleLn();
     
                                }  

                            } 

                            System.out.print(MSG_ADD_ITEM);
                                additem = Clavier.lireCharLn();
                                additem = Character.toUpperCase(additem);
                                
                               while(additem != 'O' && additem != 'N'){
                                System.out.println(MSG_ERR_AJOUT);
                                additem = Clavier.lireCharLn();
                                additem = Character.toUpperCase(additem);
                               }

                        }while( additem != 'N');
                      
                     
                    }           
          }while(reponse != '3');

          System.out.println(MSG_FIN);
    }
  }
