/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import fixtures.bodystring.AutoRestSwaggerBATService;
import fixtures.bodystring.Strings;
import fixtures.bodystring.Enums;
import com.microsoft.rest.ServiceClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestSwaggerBATService class.
 */
public final class AutoRestSwaggerBATServiceImpl extends ServiceClient implements AutoRestSwaggerBATService {

    /**
     * The Strings object to access its operations.
     */
    private Strings strings;

    /**
     * Gets the Strings object to access its operations.
     * @return the Strings object.
     */
    public Strings strings() {
        return this.strings;
    }

    /**
     * The Enums object to access its operations.
     */
    private Enums enums;

    /**
     * Gets the Enums object to access its operations.
     * @return the Enums object.
     */
    public Enums enums() {
        return this.enums;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     */
    public AutoRestSwaggerBATServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATServiceImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    private void initialize() {
        this.strings = new StringsImpl(retrofit(), this);
        this.enums = new EnumsImpl(retrofit(), this);
    }
}
