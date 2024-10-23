package projetoyoutube;
public class AppVideo {
    public static void main(String[] args) {
              
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[0].status();
        
        vis[1] = new Visualizacao(g[0], v[1]); // O mesmo Gafanhoto verá outro vídeo;
        vis[1].avaliar(87.0f);
        vis[1].status();
        
        vis[2] = new Visualizacao(g[0], v[1]); // O mesmo Gafanhoto verá o mesmo vídeo;
        vis[2].avaliar(7);
        vis[2].status();
        
        /*
        System.out.println("============== VÍDEOS ==============n");
        v[0].statusVideo();
        v[1].statusVideo();
        v[2].statusVideo();
        
        System.out.println("\n============== GAFANHOTOS ==============\n");
        g[0].statusGafanhoto();
        g[1].statusGafanhoto();
        */

    }
    
}