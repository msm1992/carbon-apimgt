package org.wso2.carbon.apimgt.rest.api.publisher.v1;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.*;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CertificateInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ClientCertMetadataDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ClientCertificatesDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ErrorDTO;
import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface ClientCertificatesApiService {
      public Response clientCertificatesAliasContentGet(String alias, SecurityContext securityContext);
      public Response clientCertificatesAliasDelete(String alias, SecurityContext securityContext);
      public Response clientCertificatesAliasGet(String alias, SecurityContext securityContext);
      public Response clientCertificatesAliasPut(String alias, InputStream certificateInputStream, Attachment certificateDetail, String tier, SecurityContext securityContext);
      public Response clientCertificatesGet(Integer limit, Integer offset, String alias, String apiId, SecurityContext securityContext);
      public Response clientCertificatesPost(InputStream certificateInputStream, Attachment certificateDetail, String alias, String apiId, String tier, SecurityContext securityContext);
}
