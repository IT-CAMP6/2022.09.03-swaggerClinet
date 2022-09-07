package pl.camp.it.rest.api;

import pl.camp.it.rest.model.OrderPositionDTO;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Bookstore API
 *
 * <p>Jakies fajne api
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface OrderPositionRestControllerApi  {

    /**
     * getOrderPositionById
     *
     */
    @GET
    @Path("/api/orderPosition/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderPositionById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPositionDTO.class) })
    public OrderPositionDTO getOrderPositionByIdUsingGET(@PathParam("id") Integer id);
}

