 import spark.ModelAndView;
 import spark.template.velocity.VelocityTemplateEngine;

 import java.util.HashMap;
 import java.util.Map;

 import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("resources/public");
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

        String layout = "public/templates/layout.vtl";

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "public/templates/index.vtl");
            return new ModelAndView(model, layout);

        },
                new VelocityTemplateEngine());
        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "public/templates/form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}