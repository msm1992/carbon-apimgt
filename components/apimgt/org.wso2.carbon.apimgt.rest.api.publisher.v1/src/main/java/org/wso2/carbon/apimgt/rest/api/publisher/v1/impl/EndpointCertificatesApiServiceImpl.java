package org.wso2.carbon.apimgt.rest.api.publisher.v1.impl;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.*;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CertMetadataDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CertificateInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CertificatesDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ErrorDTO;
import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class EndpointCertificatesApiServiceImpl implements EndpointCertificatesApiService {
      public Response endpointCertificatesAliasContentGet(String alias, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      public Response endpointCertificatesAliasDelete(String alias, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      public Response endpointCertificatesAliasGet(String alias, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      public Response endpointCertificatesAliasPut(InputStream certificateInputStream, Attachment certificateDetail, String alias, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      public Response endpointCertificatesGet(Integer limit, Integer offset, String alias, String endpoint, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      public Response endpointCertificatesPost(InputStream certificateInputStream, Attachment certificateDetail, String alias, String endpoint, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
