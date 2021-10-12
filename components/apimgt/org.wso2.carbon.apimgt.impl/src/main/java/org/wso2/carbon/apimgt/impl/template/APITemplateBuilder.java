/*
 *  Copyright WSO2 Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.apimgt.impl.template;

import org.wso2.carbon.apimgt.api.model.Environment;
import org.wso2.carbon.apimgt.api.model.ResourceEndpoint;

public interface APITemplateBuilder {

    String getConfigStringForTemplate(Environment environment) throws APITemplateException;

    String getConfigStringForPrototypeScriptAPI(Environment environment) throws APITemplateException;

    String getConfigStringForEndpointTemplate(String endpointType) throws APITemplateException;

    String getConfigStringForWebSocketEndpointTemplate(String endpointType, String resourceKey, String endpointUrl) throws APITemplateException;

    String getConfigStringForResourceEndpointTemplate(ResourceEndpoint resourceEndpoint) throws APITemplateException;

}
