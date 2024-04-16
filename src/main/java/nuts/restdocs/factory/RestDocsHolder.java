package nuts.restdocs.factory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static nuts.restdocs.factory.RestDocsHolder.RestDocsHolderType.request;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RestDocsHolder {
    RestDocsHolderType value() default request;

    enum RestDocsHolderType {
        request,
        response
    }
}
