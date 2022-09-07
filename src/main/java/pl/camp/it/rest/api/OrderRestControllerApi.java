package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Order;
import pl.camp.it.rest.model.OrderDTO;
import pl.camp.it.rest.model.OrdersResponse;

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
public interface OrderRestControllerApi  {

    /**
     * deleteOrder
     *
     */
    @DELETE
    @Path("/api/order/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "deleteOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    public void deleteOrderUsingDELETE(@PathParam("id") Integer id);

    /**
     * getOrderById
     *
     */
    @GET
    @Path("/api/order/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class) })
    public OrderDTO getOrderByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getOrders
     *
     */
    @GET
    @Path("/api/order")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrders", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrdersResponse.class) })
    public OrdersResponse getOrdersUsingGET(@QueryParam("userId")Integer userId);

    /**
     * saveOrder
     *
     */
    @POST
    @Path("/api/order")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "saveOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class) })
    public OrderDTO saveOrderUsingPOST(Order order);

    /**
     * updateOrder
     *
     */
    @PUT
    @Path("/api/order/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class) })
    public OrderDTO updateOrderUsingPUT(@PathParam("id") Integer id, Order order);
}

