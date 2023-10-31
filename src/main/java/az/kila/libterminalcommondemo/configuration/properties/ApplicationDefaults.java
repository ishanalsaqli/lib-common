package az.kila.libterminalcommondemo.configuration.properties;

public interface ApplicationDefaults {

    interface Swagger {
        String title = "API";
        String description = "API documentation";
        String version = "0.0.1";
        String termsOfServiceUrl = null;
        String contactName = null;
        String contactUrl = null;
        String contactEmail = null;
        String license = null;
        String licenseUrl = null;
        String defaultIncludePattern = ".*";
        String host = null;
        String[] protocols = {};
        boolean useDefaultResponseMessages = true;
        boolean useAuthorizationHeader = true;
        String basePackage = "az.kila.libterminalcommondemo";
    }

}
