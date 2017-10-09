package co.cdjones.camel.swagger.swagger_ui;

import co.cdjones.camel.static_fs.CamelStaticFileServer;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author chrisjones
 * @date 9/10/2017
 */
public class SwaggerUiFileServerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        String swaggerBaseURL = "/swagger-ui";

        from("direct:swagger-ui-fileserver")
            .process(
                new CamelStaticFileServer(
                    CamelStaticFileServer.FileType.RESOURCE,
                    swaggerBaseURL
                )
            );

    }
}