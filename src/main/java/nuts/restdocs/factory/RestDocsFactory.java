package nuts.restdocs.factory;

import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.restdocs.payload.RequestFieldsSnippet;
import org.springframework.restdocs.payload.ResponseFieldsSnippet;

public interface RestDocsFactory {


    RestDocumentationResultHandler document(String identifier, Class<?> requestClass, Class<?> responseClass);
    RequestFieldsSnippet requestFields(Class<?> requestClass);
    ResponseFieldsSnippet responseFields(Class<?> responesClass);
}
