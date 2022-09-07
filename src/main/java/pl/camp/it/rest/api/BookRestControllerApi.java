package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Book;
import pl.camp.it.rest.model.BookList;

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
public interface BookRestControllerApi  {

    /**
     * getBookById
     *
     */
    @GET
    @Path("/api/book/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getBookById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class) })
    public Book getBookByIdUsingGET(@PathParam("id") Integer id);

    /**
     * Find books
     *
     * Return all books or books matching to pattern
     *
     */
    @GET
    @Path("/api/book")
    @Produces({ "*/*" })
    @ApiOperation(value = "Find books", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BookList.class) })
    public BookList getBooksUsingGET(@QueryParam("pattern")String pattern);

    /**
     * updateBook
     *
     */
    @PUT
    @Path("/api/book/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class) })
    public Book updateBookUsingPUT(Book book, @PathParam("id") Integer id);
}

