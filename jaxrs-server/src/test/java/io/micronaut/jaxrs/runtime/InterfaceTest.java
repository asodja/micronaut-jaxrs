package io.micronaut.jaxrs.runtime;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class InterfaceTest {

    @Inject
    InterfaceResourceClient interfaceClient;

    @Test
    void test() {
        HttpResponse<String> response = interfaceClient.ping("asdsa");

        Assertions.assertEquals(response.getStatus(), HttpStatus.OK);
    }

}
