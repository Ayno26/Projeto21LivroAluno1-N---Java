/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro livro1 = new Livro("Chamas da Paixão", "Editora 1000", 2006);
        Autor autor1 = new Autor("Senhor Sr", 1987, "srsr@gmail.com");
        Autor autor2 = new Autor("Mister Mr", 1977, "mrmister@gmail.com");
        Autor autor3 = new Autor("Elder Antigo", 1967, "anciao@gmail.com");
        
        autor1.setObra(livro1);
        livro1.setEscritores(autor1);
        livro1.setEscritores(autor2);
        livro1.setEscritores(autor3);
                
        System.out.println("Obra: "+autor1.getObra().getTitulo());
        livro1.getEscritores();
    }    
}
