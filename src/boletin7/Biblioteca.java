package boletin7;


public class Biblioteca {
    private String titulo,autor;
    private int numLibro,numPrestados;
    
    
    public Biblioteca(){ 
    }
    
    public Biblioteca(String titulo,String autor,int numLibro,int numPrestados){
        
        this.titulo=titulo;
        this.autor=autor;
        this.numLibro=numLibro;
        this.numPrestados=numPrestados;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public void setNumLibro(int numLibro){
        this.numLibro=numLibro;
    }
    
    public void setNumPrestados(int numPrestados){
        this.numPrestados=numPrestados;
    }  
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNumLibro(){
        return numLibro;
    }
    
    public int getNumPrestados(){
        return numPrestados;
    }
    

    public boolean prestamo(){
        if(numLibro==numPrestados){
            System.out.println("Libro no disponible, espera a la devolucionde algun ejemplar de este libro");
            return false;
        }else{
            numPrestados +=1; 
            return true;
        } 
    }
    
    public boolean devolucion(){
        if(numPrestados<1){  
            System.out.println("No se puede devolver.");
            return false;
        }else{
            numPrestados -=1;
            return true;
        }
            
    }
    
    
    public String toString(){
        String message = "Tenemos "+numLibro+" ejemplares de "+titulo+" del autor "+autor+" y podemos prestar "+numPrestados;
        return message;
    }

}