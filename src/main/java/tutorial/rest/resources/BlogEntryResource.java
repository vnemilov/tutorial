package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by vemilov on 15.6.2016 г..
 */
public class BlogEntryResource extends ResourceSupport {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
