# rest-interface-demo
Demo project for Spring Boot; cannot define a RestController in a Java interface as described in Spring Cloud feign doc

Two `@RESTController`s are defined:

* `/control` - defined in a `class` as typical
* `/svc` - defined in an `interface` as suggested at http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-feign-inheritance

The two services are otherwise identical. Run the app and:

```
  curl http://localhost:8080/control/FOO
```

returns `FOO`, but

```
  curl http://localhost:8080/svc/FOO
```

yields an error.

In a real-world case, the interface would be shipped in a separate artifact;
the motivation, of course, being a convenient mechanism to share the
expectations of a service API among Java-based servers and clients.
