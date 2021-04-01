import io.quarkus.vertx.web.Route;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestRoute {

    @Route(path = "/hello")
    public String hello() {
        return "hello";
    }

}
