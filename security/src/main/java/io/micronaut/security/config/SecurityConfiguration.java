/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.config;

import io.micronaut.core.util.Toggleable;

import java.util.List;

/**
 * Defines security configuration properties.
 *
 * @author Sergio del Amo
 * @since 1.0
 */
public interface SecurityConfiguration extends Toggleable {

    /**
     * ipPatterns getter.
     * @return a list of IP Regex patterns. e.g. [192.168.1.*]
     */
    List<String> getIpPatterns();

    /**
     * interceptUrlMap getter.
     * @return a list of {@link InterceptUrlMapPattern}
     */
    List<InterceptUrlMapPattern> getInterceptUrlMap();
}