/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Toshiba
 */
public class Perpustakaan {
     private HashMap<String, String[]> bukuData = new HashMap<>();
    
     public Perpustakaan(){
         bukuData.put("Fantasi", new String[]{"PILIH", "Harry Potter", "The Hunger Games", "Alice in Wonderland", "Narnia", "Lord of the Rings"});
         bukuData.put("Aksi", new String[]{"PILIH","The Da Vinci Code", "James Bond", "Mission Impossible"});
         bukuData.put("Edukasi", new String[]{"PILIH", "Educated", "How To Win Friends and Influence People", "Sapiens"});
         bukuData.put("Romansa", new String[]{"PILIH", "Dilan 1990", "Pride and Prejudice", "The Notebook", "Romeo and Juliet"});
     }
    
     public String[] getJudulBuku(String kategori) {
        return bukuData.get(kategori);
    }
     
     public String[] getDataBuku(String judulBuku) {
        String[] dataBuku = new String[3];
        if (judulBuku.equals("Harry Potter")) {
            dataBuku[0] = "J.K Rowling";
            dataBuku[1] = "Bloomsburry";
            dataBuku[2] = "3006001";
        } else if (judulBuku.equals("The Hunger Games")) {
            dataBuku[0] = "Suzanne Collins";
            dataBuku[1] = "Scholastic Press";
            dataBuku[2] = "3006002";
        } else if (judulBuku.equals("Alice in Wonderland")) {
            dataBuku[0] = "Lewis Carroll";
            dataBuku[1] = "Macmillan Publishers";
            dataBuku[2] = "3006003";
        } else if (judulBuku.equals("Narnia")) {
            dataBuku[0] = "C.S. Lewis";
            dataBuku[1] = "Geoffrey Bles";
            dataBuku[2] = "3006004";
        } else if (judulBuku.equals("Lord of the Rings")) {
            dataBuku[0] = "J.R.R. Tolkien";
            dataBuku[1] = "Allen & Unwin";
            dataBuku[2] = "3006005";
        } else if (judulBuku.equals("The Da Vinci Code")) {
            dataBuku[0] = "Dan Brown";
            dataBuku[1] = "Doubleday";
            dataBuku[2] = "3006006";
        } else if (judulBuku.equals("James Bond")) {
            dataBuku[0] = "Ian Fleming";
            dataBuku[1] = "Jonathan Cape";
            dataBuku[2] = "3006007";
        } else if (judulBuku.equals("Mission Impossible")) {
            dataBuku[0] = "J.M. Dillard";
            dataBuku[1] = "Pocket Books";
            dataBuku[2] = "3006008";
        } else if (judulBuku.equals("Educated")) {
            dataBuku[0] = "Tara Westover";
            dataBuku[1] = "Random House";
            dataBuku[2] = "3006009";
        } else if (judulBuku.equals("How To Win Friends and Influence People")) {
            dataBuku[0] = "Dale Carnegie";
            dataBuku[1] = "Simon & Schuster";
            dataBuku[2] = "3006010";
        } else if (judulBuku.equals("Sapiens")) {
            dataBuku[0] = "Yuval Noah Harari";
            dataBuku[1] = "Harper";
            dataBuku[2] = "3006011";
        } else if (judulBuku.equals("Dilan 1990")) {
            dataBuku[0] = "Pidi Baiq";
            dataBuku[1] = "Dar Mizan";
            dataBuku[2] = "3006012";
        } else if (judulBuku.equals("Pride and Prejudice")) {
            dataBuku[0] = "Jane Austen";
            dataBuku[1] = "T. Egerton, Whitehall";
            dataBuku[2] = "3006013";
        } else if (judulBuku.equals("The Notebook")) {
            dataBuku[0] = "Nicholas Sparks";
            dataBuku[1] = "Warner Books";
            dataBuku[2] = "3006014";
        } else if (judulBuku.equals("Romeo and Juliet")) {
            dataBuku[0] = "William Shakespeare";
            dataBuku[1] = "Thomas Creede";
            dataBuku[2] = "3006015";
        } else {
            dataBuku[0] = "";
            dataBuku[1] = "";
            dataBuku[2] = "";
        }
        return dataBuku;
    }
}
