import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class VistaApp {
    public static void main(String[] args) {
        Date fecha = new Date();
        Texto post1 = new Texto(111, "Wicho245", fecha, fecha.getHours(), new ArrayList<String>(), new ArrayList<String>(), "Progra orientada a objetos" );

        post1.getHashtags().add("#Wicho");
        post1.getComentarios().add("AAAAA");
        post1.getComentarios().add("OOOO");
        /* System.out.println(post1.toString()); */

        Emoticon post2 = new Emoticon(112, "Wicho245", fecha, fecha.getHours(), new ArrayList<String>(), new ArrayList<String>(), "):)" );

        post2.getHashtags().add("#bajoAcomplamiento");
        post2.getComentarios().add("Hola 1");
        post2.getComentarios().add("Hola 2");
        /* System.out.println(post2.toString()); */

        Audio post3 = new Audio(113, "Wicho245", fecha, fecha.getHours(), new ArrayList<String>(), new ArrayList<String>(), "Formato 360", 45, "https://www.youtube.com/watch?v=6cRctjPRv6M", 12.34f, 45);

        post3.getHashtags().add("#bajoAcomplamiento");
        post3.getComentarios().add("Hola 1");
        post3.getComentarios().add("Hola 2");
      /*   System.out.println(post3.toString()); */

        Video post4 = new Video(114, "Wicho245", fecha, fecha.getHours(), new ArrayList<String>(), new ArrayList<String>(), "Formato 360", 45, "https://www.youtube.com/watch?v=6cRctjPRv6M", 24);

        post4.getHashtags().add("#bajoAcomplamiento");
        post4.getComentarios().add("Hola 1");
        post4.getComentarios().add("Hola 2");
        /*System.out.println(post4.toString()); */

        App app = new App();
        app.crearPost(post1);
        app.crearPost(post2);
        app.crearPost(post3);
        app.crearPost(post4);

        app.agregarComentarios(114, "Nuevo comentario");
        System.out.println(app.getPosts().get(3).toString());
        
        Scanner teclado = new Scanner(System.in);

        boolean loop =true;
    while (loop== true){
        System.out.println("\nBienvenido, elige una opción: " + "\n"+"1. Ver publicaciones" + "\n" + "2. Agregar comentario a publicación"+ "\n" + "3. Salir");
        int decision = teclado.nextInt();
        if (decision == 1){
        
            ArrayList<Post> posts = app.getPosts();
            for (Post post : posts) {
                System.out.println(post.toString());
            }
    
        }
                 
        else if (decision == 2){
        
            teclado.nextLine();
            System.out.println("Ingresar usuaario");
            String nombre = teclado.nextLine();
    
            System.out.println("Ingresar hashtags");
            String pais = teclado.nextLine();

            System.out.println("\nElige una opción: " + "\n"+"1. " + "\n" + "2. Agregar comentario a publicación"+ "\n" + "3. Salir");

        }
        else if (decision == 3){
            loop=false;
                
        }    
    }
}
}
