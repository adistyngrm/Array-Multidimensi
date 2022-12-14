
package array.multidimensi.tambahan.nilai;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayMultidimensiTambahanNilai {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       String [][] makanan = new String [5][5];
       
       makanan [0][0] = "Thailand"; makanan [0][1] = "Tom yam, Som Tam, Pad Thai";
       makanan [1][0] = "Jepang"; makanan [1][1] = "Sushi, Sashimi, Shabu - Shabu";
       makanan [2][0] = "Singapura"; makanan [2][1] = "Nasi Ayam Hainan, Laksa, Nasi Lemak";
       makanan [3][0] = "Taiwan"; makanan [3][1] = "Mie Kuah Sapi, Chou Doufu, Gua Bao";
       makanan [4][0] = "Filipina"; makanan [4][1] = "Lechon Babi, Kwek - Kwek, Chicken Inasal";
       
       System.out.println("Ingin tahu makanan favorite negara mana?");
       System.out.println("\n1. Thailand\n2. Jepang\n3. Singapura\n4. Taiwan\n5. Filipina");
       System.out.print("\nPilih : ");
       int pilihan = input.nextInt();
       
        switch (pilihan){
            case 1 : 
                System.out.println("\nMakanan khas negara " + makanan [0][0] + " adalah " + makanan [0][1]);
                break;
            case 2 :
                System.out.println("\nMakanan khas negara " + makanan [1][0] + " adalah " + makanan [1][1]);
                break;
            case 3 :
                System.out.println("\nMakanan khas negara " + makanan [2][0] + " adalah " + makanan [2][1]);
                break;
            case 4 :
                System.out.println("\nMakanan khas negara " + makanan [3][0] + " adalah " + makanan [3][1]);
                break;
            case 5 :
                System.out.println("\nMakanan khas negara " + makanan [4][0] + " adalah " + makanan [4][1]);
                break;
            default :
                System.out.println("Input Salah");
            
       
      
        
                
                
            }
            
            
        }
        
    }
    

