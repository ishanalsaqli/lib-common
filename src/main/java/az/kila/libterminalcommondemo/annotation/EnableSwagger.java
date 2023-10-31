package az.kila.libterminalcommondemo.annotation;

import az.kila.libterminalcommondemo.configuration.SwaggerConfiguration;
import az.kila.libterminalcommondemo.configuration.properties.SwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@EnableConfigurationProperties(SwaggerProperties.class)
@Import(SwaggerConfiguration.class)
public @interface EnableSwagger {
}
