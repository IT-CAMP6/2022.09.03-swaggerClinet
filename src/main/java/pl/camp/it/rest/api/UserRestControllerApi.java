package pl.camp.it.rest.api;

import pl.camp.it.rest.model.User;
import pl.camp.it.rest.model.UserDTO;
import pl.camp.it.rest.model.UsersResponse;

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
public interface UserRestControllerApi  {

    /**
     * getUserByLogin
     *
     */
    @GET
    @Path("/api/user/{login}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getUserByLogin", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class) })
    public UserDTO getUserByLoginUsingGET(@PathParam("login") String login);

    /**
     * getUsers
     *
     */
    @GET
    @Path("/api/user")
    @Produces({ "*/*" })
    @ApiOperation(value = "getUsers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UsersResponse.class) })
    public UsersResponse getUsersUsingGET();

    /**
     * saveUser
     *
     */
    @POST
    @Path("/api/user")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "saveUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class) })
    public UserDTO saveUserUsingPOST(User user);
}

