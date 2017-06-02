public class ExemplesPrintf {
  
   /*
      NOTES :
         - : aligner a gauche
        (rien) : aligner a droite
      
        type String              : s ou S(transforme la chaine en maj)
        type float ou double     : f
        type byte/short/int/long : d
      
        Exemples : 
            %20s      : string sur 20 colonnes, alignee a droite
            %-10.3f   : float ou double sur 10 colonnes, aligne a gauche
                        arrondi a 3 dec.
            %15d      : entier sur 15 colonnes, aligne a droite
   */

   /**
    * Divers exemples d'utilisation de printf
    * @param params (tableau vide)
    */
   public static void main(String[] params) {
      
      //variables
      String s1 = "bateau";
      String s2 = "AUTOMOBILE";
      String s3 = "Avion a reaction";

      double d1 = 99999.65432134;
      double d2 = 0.456;
      float f1 = 65.6f;
      float f2 = 123f;

      byte i1 = 2;
      short i2 = 30;
      int i3 = 100;
      long i4 = 3456;
    
      //Exemples avec des variables de type String
      System.out.println("-------------------------------------------------------");
      System.out.println("EXEMPLE 1 : alignement a droite");
      System.out.println("-------------------------------------------------------\n");

      System.out.printf("%20s%20s%20s\n", s1, s2, s3);
      System.out.printf("%20s%20s%20s\n", s3, s2, s1);
      System.out.printf("%20s%20s%20s\n", s1, s3, s2);

      System.out.println("\n\n-------------------------------------------------------");
      System.out.println("EXEMPLE 2 : alignement a gauche et majuscules");
      System.out.println("-------------------------------------------------------\n");

      System.out.printf("%-20S%-20S%-20S\n", s1, s2, s3);
      System.out.printf("%-20S%-20S%-20S\n", s3, s2, s1);
      System.out.printf("%-20S%-20S%-20s\n", s1, s3, s2);

      System.out.println("\n\n-------------------------------------------------------");
      System.out.println("EXEMPLE 3 : alignement mixte");
      System.out.println("-------------------------------------------------------\n");

      System.out.printf("%-40S%-20S%10S\n", "TITRE", "AUTEUR", "PRIX");
      System.out.println("----------------------------------------------------------------------");
      System.out.printf("%-40s%-20s%10s\n", "Le guide du routard galactique", "Adams D.", "15.39 $");
      System.out.printf("%-40s%-20s%10s\n", "Messieurs les enfants", "Pennac D.", "138.95 $");


      //Exemples avec des variables de type float ou double
      System.out.println("\n\n-------------------------------------------------------");
      System.out.println("EXEMPLE 4 : double / float arrondis a deux dec.");
      System.out.println("-------------------------------------------------------\n");

      System.out.printf("%-30.2f%-30.2f\n", d1, f1);
      System.out.printf("%-30.2f%-30.2f\n", f1, d1);
      System.out.printf("%-30.2f%-30.2f\n", f2, d2);

      System.out.println("\n\n-------------------------------------------------------");
      System.out.println("EXEMPLE 5 : avec signe dollar");
      System.out.println("-------------------------------------------------------\n");

      System.out.printf("%30.2f $%30.2f $\n", d1, f1);
      System.out.printf("%30.2f $%30.2f $\n", f1, d1);
      System.out.printf("%30.2f $%30.2f $\n", f2, d2);

      //Exemples avec des variables de type byte, short, int, long
      System.out.println("\n\n-------------------------------------------------------");
      System.out.println("EXEMPLE 6 : avec byte/short/int/long");
      System.out.println("-------------------------------------------------------\n");
      
      System.out.println("Alignement a droite");
      System.out.printf("%30d%30d\n", i1, i2);
      System.out.printf("%30d%30d\n", i3, i4);
      System.out.println("Alignement a gauche");
      System.out.printf("%-30d%-30d\n", i1, i2);
      System.out.printf("%-30d%-30d\n", i3, i4);

   }

} 