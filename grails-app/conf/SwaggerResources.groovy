modules = {
    swagger {
        resource url: '/vendor/swagger-ui/2.0.14/css/highlight.default.css', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/css/screen.css', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/shred.bundle.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/jquery-1.8.0.min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/jquery.slideto.min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/jquery.wiggle.min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/jquery.ba-bbq.min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/handlebars-1.0.0.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/underscore-min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/backbone-min.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/swagger.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/swagger-ui.js', plugin: 'swagger4jaxrs', disposition: 'head'
        resource url: '/vendor/swagger-ui/2.0.14/lib/highlight.7.3.pack.js', plugin: 'swagger4jaxrs', disposition: 'head'

        // enabling this will enable oauth2 implicit scope support
        //resource url: '/vendor/swagger-ui/2.0.14/lib/swagger-oauth.js', plugin: 'swagger4jaxrs', disposition: 'head'
    }
}