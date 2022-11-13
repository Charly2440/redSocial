import java.util.ArrayList;

public class App {
    private ArrayList<Post> posts;

    public App() {
        posts = new ArrayList<Post>();
    }

    public App(ArrayList<Post> posts) {
        this.posts = posts;
    }

    
    public void crearPost(Post j){
        posts.add(j);
    }

    public void agregarComentarios(int id, String comentario){
        for (Post post : posts) {
            if (post.getId() == id){
                post.getComentarios().add(comentario);
            }
        }
    }


    /* Getters and setters */

    public ArrayList<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public App posts(ArrayList<Post> posts) {
        setPosts(posts);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof App)) {
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{" +
            " posts='" + getPosts() + "'" +
            "}";
    }

}
