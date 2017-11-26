/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015-2017 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bernardomg.example.swss.test.integration.client.signature.wss4j;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.bernardomg.example.swss.test.util.config.context.ClientWss4jContextPaths;
import com.bernardomg.example.swss.test.util.config.properties.TestEndpointXwssPropertiesPaths;
import com.bernardomg.example.swss.test.util.config.properties.TestPropertiesPaths;
import com.bernardomg.example.swss.test.util.test.integration.client.AbstractITEntityClient;

/**
 * Integration test for a signed web service using WSS4J for the client and XWSS
 * for the web service.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 */
@ContextConfiguration(locations = { ClientWss4jContextPaths.SIGNATURE })
@TestPropertySource({ TestPropertiesPaths.ENTITY, TestPropertiesPaths.KEYSTORE,
        TestEndpointXwssPropertiesPaths.SIGNATURE })
public final class ITEntityClientSignatureWss4jToXwss
        extends AbstractITEntityClient {

    /**
     * Default constructor.
     */
    public ITEntityClientSignatureWss4jToXwss() {
        super();
    }

}