package tutorial.core.entities;

/**
 * Created by vemilov on 15.6.2016 г..
 */
public class BlogEntry {

    private Long id;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
